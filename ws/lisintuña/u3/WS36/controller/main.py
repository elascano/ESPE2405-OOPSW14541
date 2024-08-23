from park import Park # type: ignore
from database import Database

def main():
    # Conectar a la base de datos
    uri = "mongodb+srv://<username>:<password>@cluster0.mongodb.net/test"
    db_name = "park_database"
    database = Database(uri, db_name)

    # Crear un nuevo parque
    nuevos_nombres = "Juan Perez"
    nueva_direccion = "Calle Falsa 123"
    nueva_edad = 30
    new_park = Park(nuevos_nombres, nueva_direccion, nueva_edad)
    park_id = database.insert_park(new_park)
    print(f"Inserted park with ID: {park_id}")

    # Listar todos los parques
    parks = database.get_parks()
    for park in parks:
        print(park)

if __name__ == "__main__":
    main()
