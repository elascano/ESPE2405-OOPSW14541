import sys
import os

# Agrega el directorio principal del proyecto al path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from ec_edu_espe_cellphonestore_model.CellPhoneStore import CellPhoneStore

def main():
    store = None

    while True:
        if store is None:
            while True:
                store_id = input("Ingrese el ID de la tienda (1 o 2): ")
                if store_id in ['1', '2']:
                    store = CellPhoneStore(store_id=store_id)
                    break
                else:
                    print("ID de tienda no válido. Intente de nuevo.")
        
        print("\nMenú:")
        print("1. Agregar celular")
        print("2. Vender celular")
        print("3. Eliminar celular")
        print("4. Modificar celular")
        print("5. Mostrar inventario de todas las tiendas")
        print("6. Seleccionar otra tienda")
        print("7. Salir")

        option = input("Seleccione una opción: ")

        if option == '1':
            store.add_phone()
        elif option == '2':
            model = input("Ingrese el modelo del celular a vender: ")
            CellPhoneStore.sell_phone_in_any_store(model)
        elif option == '3':
            model = input("Ingrese el modelo del celular a eliminar: ")
            while True:
                try:
                    quantity = int(input("Ingrese la cantidad a eliminar: "))
                    break
                except ValueError:
                    print("Por favor, ingrese una cantidad válida.")
            store.delete_phone(model, quantity)
        elif option == '4':
            model = input("Ingrese el modelo del celular a modificar: ")
            CellPhoneStore.modify_phone_in_any_store(model)
        elif option == '5':
            CellPhoneStore.show_all_inventories()
        elif option == '6':
            store = None
        elif option == '7':
            print("Saliendo del programa...")
            break
        else:
            print("Opción no válida. Intente de nuevo.")

if __name__ == "__main__":
    main()

