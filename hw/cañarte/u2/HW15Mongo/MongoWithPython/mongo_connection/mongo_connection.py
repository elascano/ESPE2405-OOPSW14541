from pymongo import MongoClient
import logging

# @author Saray Cañarte, codecreators, DCCO - ESPE
 
def main():
    # code to not show mongo messages
    logging.basicConfig(level=logging.WARNING)

    mongo_client = MongoClient("mongodb+srv://canarte:canarte@cluster0.devwm9s.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
    database = mongo_client["oop"]
    collection = database["students"]

    add_student(collection)

    mongo_client.close()

def add_student(collection):
    while True:
        print("***Student Data***")
        
        id = input("ID: ")
        name = input("Name: ")
        male = input("Male gender? (true/false): ").strip().lower() == 'true'
        siblings = int(input("Siblings: "))

        student = {
            "id": id,
            "name": name,
            "male": male,
            "siblings": siblings
        }

        collection.insert_one(student)
        print("Student added to database!")

        continue_input = input("Do you want to add another student? (yes/no): ").strip().lower()
        if continue_input != 'yes':
            break

if __name__ == "__main__":
    main()
