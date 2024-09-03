
# Importar SortContext desde el archivo sort_context.py
from pymongo import MongoClient # type: ignore
from sort_context import SortContext # type: ignore

# Función para guardar los resultados en MongoDB
def save_to_mongo(unsorted, size, algorithm, sorted_array):
    # Configuración de la conexión a MongoDB Atlas
    uri = "TU_URI_DE_MONGODB_ATLAS"
    client = MongoClient(uri)
    db = client['strategyLastName']  # Nombre de la base de datos
    collection = db['arrayFirstName']  # Nombre de la colección

    # Datos a insertar
    document = {
        "unsorted": ', '.join(map(str, unsorted)),
        "size": size,
        "sort algorithm": algorithm,
        "sorted": ', '.join(map(str, sorted_array))
    }

    # Insertar en la base de datos
    collection.insert_one(document)
    print("Datos guardados en MongoDB:", document)
    client.close()

# Función principal
def main():
    try:
        # Solicitar los números al usuario
        input_data = input("Ingrese los números a ordenar, separados por comas: ")
        numbers = [int(num.strip()) for num in input_data.split(',')]

        # Validar el tamaño del arreglo
        if len(numbers) <= 1:
            print("El arreglo debe tener más de un elemento.")
            return

        # Configurar el contexto y seleccionar la estrategia de ordenamiento
        context = SortContext()
        context.set_strategy(len(numbers))
        sorted_numbers = context.sort_array(numbers[:])  # Ordenar una copia del arreglo

        # Mostrar resultados
        print(f"Arreglo original: {numbers}")
        print(f"Algoritmo seleccionado: {context.get_strategy_name()}")
        print(f"Arreglo ordenado: {sorted_numbers}")

        # Guardar en MongoDB
        save_to_mongo(numbers, len(numbers), context.get_strategy_name(), sorted_numbers)

    except ValueError as e:
        print(f"Error: {e}")

if __name__ == "__main__":
    main()
