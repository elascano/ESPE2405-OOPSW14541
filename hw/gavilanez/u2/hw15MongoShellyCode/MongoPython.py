from pymongo import MongoClient

# Conectarse a MongoDB
client = MongoClient("mongodb+srv://gavilanez:gavilanez@cluster0.ie6zmbv.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")

# Seleccionar la base de datos
db = client['oop']

# Seleccionar la colección
colection = db['students']

# Crear el documento
data = {
    "id": "L0040563",
    "name": "Kenny Gavilanez",
    "male": True,
    "siblings": 4
}

# Insertar el documento
result = colection.insert_one(data)

# Consultar el documento
print(f"Documento agregado con ID: {result.inserted_id}")