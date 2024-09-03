
from pymongo import MongoClient

try:
    client = MongoClient("mongodb+srv://rodriguez:rodriguez@cluster0.0otfs2m.mongodb.net/")
    db = client['strategyRodriguez']
    collection = db['arrayDavid']
    print("Connection Successful!")
except Exception as e:
    print(f"An error occurred: {e}")

class Database:
    def __init__(self, connection_string, db_name, collection_name):
        self.client = MongoClient(connection_string)
        self.db = self.client[db_name]
        self.collection = self.db[collection_name]

    def save_sort_result(self, unsorted, size, algorithm, sorted_list):
        document = {
            "unsorted": ','.join(map(str, unsorted)),
            "size": size,
            "sort algorithm": algorithm,
            "sorted": ','.join(map(str, sorted_list))
        }
        self.collection.insert_one(document)
        print("Data saved to MongoDB")
