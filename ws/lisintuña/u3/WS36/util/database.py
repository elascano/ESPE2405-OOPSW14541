from pymongo import parks # type: ignore

class Database:
    def __init__(self, uri, db_name):
        self.client = parks(uri)
        self.db = self.client[db_name]

    def insert_park(self, park):
        parks_collection = self.db['parks']
        result = parks_collection.insert_one(park.to_dict())
        return result.inserted_id

    def get_parks(self):
        parks_collection = self.db['parks']
        return list(parks_collection.find())