import sys
import os

# Añadir el directorio raíz del proyecto al PYTHONPATH
sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from ec_edu_espe_controller.sd_card_controller import SDCardController

def main():
    controller = SDCardController("sd_cards.json")

    while True:
        print("1. Crear SD Card")
        print("2. Ver todas las SD Cards")
        print("3. Salir")
        option = input("Seleccione una opción: ")

        if option == '1':
            id = input("ID: ")
            capacity = input("Capacidad: ")
            brand = input("Marca: ")
            speed_class = input("Clase de velocidad: ")
            controller.create_sd_card(id, capacity, brand, speed_class)
        elif option == '2':
            sd_cards = controller.get_all_sd_cards()
            for sd_card in sd_cards:
                print(sd_card.to_dict())
        elif option == '3':
            break
        else:
            print("Opción no válida. Intente de nuevo.")

if __name__ == "__main__":
    main()