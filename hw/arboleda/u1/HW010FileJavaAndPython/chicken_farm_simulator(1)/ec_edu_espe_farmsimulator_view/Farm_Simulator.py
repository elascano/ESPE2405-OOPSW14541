import sys
import os

# Agrega el directorio principal del proyecto al path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from datetime import datetime
from ec_edu_espe_farmsimulator_model.Chicken import Chicken
from ec_edu_espe_farmsimulator_controller.file_manager import save_to_file

def main():
        print("Abner's Farm Simulator")
        # Solicitar datos al usuario
        id = int(input("Enter id: "))

        name = input("Enter name: ")

        color = input("Enter color: ")

        age = int(input("Enter age: "))

        molting = input("Is molting (true/false): ").strip().lower() == 'true'

        born_on_date_str = input("Enter born on date (yyyy-MM-dd): ")
        born_on_date = datetime.strptime(born_on_date_str, '%Y-%m-%d')

        # Crear objeto Chicken
        chicken = Chicken(id, name, color, age, molting, born_on_date)

        # Mostrar los datos del objeto Chicken
        print(chicken)

        # Guardar los datos en un archivo de texto
        save_to_file(chicken)

if __name__ == "__main__":
    main()