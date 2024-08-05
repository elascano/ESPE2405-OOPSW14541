from pymongo import MongoClient

class DatabaseManager:
    def __init__(self, mongo_uri, db_name, collection_name):
        self.client = MongoClient(mongo_uri)
        self.db = self.client[db_name]
        self.collection = self.db[collection_name]

    def save_calculation(self, process_id, nombre_proceso, precio_base, impuesto, num_documentation, total_price):
        calculation = {
            "process_id": process_id,
            "nombre_proceso": nombre_proceso,
            "precio_base": precio_base,
            "impuesto": impuesto,
            "num_documentation": num_documentation,
            "total_price": total_price
        }
        self.collection.insert_one(calculation)
