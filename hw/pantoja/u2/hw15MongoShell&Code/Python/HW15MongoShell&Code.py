from pymongo import MongoClient

def main():
    client = MongoClient("mongodb+srv://cdpantoja2:pantoja@cluster0.uqhoeh0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
    
    database = client["OOP"]
    collection = database["Students"]

    id = input("Enter id: ")
    name = input("Enter name: ")
    male = input("Is male? (true/false): ").lower() == "true"
    siblings = input("Enter the number of siblings: ")

    document = {
        "id": id,
        "name": name,
        "male": male,
        "siblings": siblings
    }

    collection.insert_one(document)
    client.close()
    

if __name__ == "__main__":
    main()