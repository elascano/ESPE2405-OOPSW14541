# util/database.py

from pymongo import MongoClient

def get_db():
    client = MongoClient('mongodb://localhost:27017/')
    db = client['fish_db']
    return db

def insert_fish(fish_data):
    db = get_db()
    fish_collection = db['fish']
    result = fish_collection.insert_one(fish_data)
    return result.inserted_id