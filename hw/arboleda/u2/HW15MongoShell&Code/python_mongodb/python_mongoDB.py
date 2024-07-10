from pymongo import MongoClient

# Para MongoDB Atlas
client = MongoClient("mongodb+srv://adarboleda:adarboleda@cluster0.es09omc.mongodb.net/")

# Selecciona la base de datos
db = client.oop

# Selecciona la colección
coleccion = db.students

# Documento a insertar
documento = {
    "id": "L000584",
    "nombre": "Abner Roman",
    "male": True,
    "siblings": 1
}

# Inserta el documento
resultado = coleccion.insert_one(documento)

# Muestra el ID del documento insertado
print("Documento insertado con ID:", resultado.inserted_id)
