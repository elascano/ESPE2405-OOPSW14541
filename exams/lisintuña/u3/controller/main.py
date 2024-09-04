from pymongo import MongoClient 
from controller.sort_context import SortContext

def save_to_mongo(unsorted, size, algorithm, sorted_array):
    uri = "TU_URI_DE_MONGODB_ATLAS"
    client = MongoClient(uri)
    db = client['strategyLastName']
    collection = db['arrayFirstName']

    document = {
        "unsorted": ', '.join(map(str, unsorted)),
        "size": size,
        "sort algorithm": algorithm,
        "sorted": ', '.join(map(str, sorted_array))
    }

    collection.insert_one(document)
    print("Datos guardados en MongoDB:", document)
    client.close()

def main():
    try:
        input_data = input("Ingrese los números a ordenar, separados por comas: ")
        numbers = [int(num.strip()) for num in input_data.split(',')]

        if len(numbers) <= 1:
            print("El arreglo debe tener más de un elemento.")
            return

        context = SortContext()
        context.set_strategy(len(numbers))
        sorted_numbers = context.sort_array(numbers[:])

        print(f"Arreglo original: {numbers}")
        print(f"Algoritmo seleccionado: {context.get_strategy_name()}")
        print(f"Arreglo ordenado: {sorted_numbers}")

        save_to_mongo(numbers, len(numbers), context.get_strategy_name(), sorted_numbers)

    except ValueError as e:
        print(f"Error: {e}")

if __name__ == "__main__":
    main()
