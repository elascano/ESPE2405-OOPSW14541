from pymongo import MongoClient

def insert_data(data):
    client = MongoClient("mongodb+srv://gavilanez:gavilanez@cluster0.ie6zmbv.mongodb.net/")
    db = client["oop"]
    collection = db["park"]
    collection.insert_one(data)
