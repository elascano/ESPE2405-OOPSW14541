from pymongo import MongoClient
from pymongo.collection import Collection

def main():
    # Reemplaza esto con tu URI de conexión de MongoDB Atlas
    uri = "mongodb+srv://alexisviterigithub:ajviteri2@ajviteri2.y5pwei7.mongodb.net/"

    # Crear un cliente de MongoDB
    try:
        client = MongoClient(uri)
        
        # Seleccionar la base de datos
        database = client["oop"]
        
        # Seleccionar la colección
        collection: Collection = database["student"]

        # Leer los datos del usuario
        id = input("Id: ")
        name = input("Name: ")

        male_input = input("Male (True or False): ").strip().lower()
        male = male_input == 'true'

        sibling = int(input("Siblings: "))

        # Crear un documento
        student = {
            "id": id,
            "name": name,
            "male": male,
            "sibling": sibling
        }

        # Insertar el documento en la colección
        collection.insert_one(student)

        print("Document is updated")

    except Exception as e:
        print(f"An error occurred: {e}")

if __name__ == "__main__":
    main()