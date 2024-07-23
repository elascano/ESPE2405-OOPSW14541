import pymongo
from pymongo import MongoClient
import sys

def insert_document(collection):
    id = input("Enter ID: ")
    name = input("Enter name: ")
    male = input("Enter gender (true for male, false for female): ")
    siblings = input("Enter number of siblings: ")

    doc = {
        "id": id,
        "name": name,
        "male": male,
        "siblings": siblings
    }

    collection.insert_one(doc)
    print("Document inserted successfully!")

def update_document(collection):
    id = input("Enter the ID of the document to edit: ")

    name = input("Enter new name (leave blank to keep unchanged): ")
    male = input("Enter new gender (true for male, false for female, leave blank to keep unchanged): ")
    siblings = input("Enter new number of siblings (leave blank to keep unchanged): ")

    updated_doc = {}
    if name:
        updated_doc["name"] = name
    if male:
        updated_doc["male"] = male
    if siblings:
        updated_doc["siblings"] = siblings

    if updated_doc:
        collection.update_one({"id": id}, {"$set": updated_doc})
        print("Document updated successfully!")
    else:
        print("No changes made.")

def delete_document(collection):
    id = input("Enter the ID of the document to delete: ")
    collection.delete_one({"id": id})
    print("Document deleted successfully!")

def main():
    client = MongoClient("mongodb+srv://rodriguez:rodriguez@cluster0.0otfs2m.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
    database = client["oop"]
    collection = database["students"]

    while True:
        print("Select an option:")
        print("1. Insert a document")
        print("2. Edit a document")
        print("3. Delete a document")
        print("4. Exit")
        option = input()

        if option == '1':
            insert_document(collection)
        elif option == '2':
            update_document(collection)
        elif option == '3':
            delete_document(collection)
        elif option == '4':
            client.close()
            print("Connection closed. Goodbye!")
            sys.exit()
        else:
            print("Invalid option, please try again.")

if __name__ == "__main__":
    main()
