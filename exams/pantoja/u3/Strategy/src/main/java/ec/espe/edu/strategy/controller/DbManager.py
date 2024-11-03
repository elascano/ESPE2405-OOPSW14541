from pymongo import MongoClient, errors
from bson.objectid import ObjectId
import json

class DbManager:
    def __init__(self):
        self.mongo_client = None
        self.database = None

    def connect(self, uri, database_name):
        try:
            self.mongo_client = MongoClient(uri)
            self.database = self.mongo_client[database_name]
            print("Connected successfully to server.")
        except errors.PyMongoError as e:
            print(f"An error occurred while attempting to connect: {e}")

    def read_collection(self, collection_name):
        list_objects = []
        try:
            collection = self.database[collection_name]
            cursor = collection.find()
            for document in cursor:
                list_objects.append(json.dumps(document, default=str))
        except Exception as e:
            print("Error: read Collection fail", e)
        return list_objects

    def add_sort_app(self, sort_app, collection):
        unordered = sort_app['unordered']
        ordered = sort_app['ordered']
        try:
            result = collection.insert_one({
                "_id": ObjectId(),
                "unordered": unordered,
                "ordered": ordered
            })
            print(f"Success! Inserted document id: {result.inserted_id}")
        except errors.PyMongoError as e:
            print(f"Unable to insert due to an error: {e}")

    def save_sort_app(self, sort_app, collection_name):
        try:
            collection = self.database[collection_name]
            unordered = sort_app['unordered']
            ordered = sort_app['ordered']
            document = {
                "_id": ObjectId(),
                "unordered": unordered,
                "ordered": ordered
            }
            result = collection.insert_one(document)
            print(f"Success! Inserted document id: {result.inserted_id}")
        except errors.PyMongoError as e:
            print(f"Unable to insert due to an error: {e}")

    def get_mongo_client(self):
        return self.mongo_client

    def set_mongo_client(self, mongo_client):
        self.mongo_client = mongo_client

    def get_database(self):
        return self.database

    def set_database(self, database):
        self.database = database

