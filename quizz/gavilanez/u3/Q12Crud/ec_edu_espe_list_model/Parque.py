from pymongo import MongoClient

class Parque:
    def __init__(self):
        # Conexión a la base de datos MongoDB
        self.client = MongoClient('mongodb+srv://gavilanez:gavilanez@cluster0.ie6zmbv.mongodb.net/')  # Cambia la URL si es necesario
        self.db = self.client['oop']  # Nombre de tu base de datos
        self.collection = self.db['park']  # Nombre de la colección

    def obtener_parques(self, nombre=None):
        if nombre:
            # Buscar parques por nombre (uso de expresiones regulares para hacer búsqueda parcial)
            return list(self.collection.find({"Nombre": {"$regex": nombre, "$options": "i"}}))
        else:
            # Retornar todos los parques si no se especifica nombre
            return list(self.collection.find())