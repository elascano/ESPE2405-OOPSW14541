import pymongo

class MongoDB:
    def __init__(self):
        self.client = pymongo.MongoClient("mongodb+srv://gavilanez:gavilanez@cluster0.ie6zmbv.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
        self.db = self.client["oop"]
        self.collection = self.db["pattern"]

    def save_sort_result(self, unsorted, size, algorithm, sorted):
        document = {
            "unsorted": ','.join(map(str, unsorted)),
            "size": size,
            "sort algorithm": algorithm,
            "sorted": ','.join(map(str, sorted))
        }
        self.collection.insert_one(document)
