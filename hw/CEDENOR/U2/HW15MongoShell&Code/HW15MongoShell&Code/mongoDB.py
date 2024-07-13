from pymongo import MongoClient

client = MongoClient("mongodb+srv://nncedeno1:beaTLES123@cluster0.tkhbv81.mongodb.net/")

db = client['OOP']

coleccion = db['students']

documento = {
    "id": "L00394185",
    "name": "Nahomi Cedeño",
    "male": True,
    "siblings": 4
}

resultado = coleccion.insert_one(documento)

print(f"Documento agregado con ID: {resultado.inserted_id}")