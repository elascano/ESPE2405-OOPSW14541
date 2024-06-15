import sys
import os
from datetime import datetime

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_farmsimulator_model.Chicken import Chicken
from ec_edu_espe_farmsimulator_controller.SaveToFile import SaveToFile

class FarmSimulator:
    @staticmethod
    def calculate_age(born):
        today = datetime.today()
        return today.year - born.year - ((today.month, today.day) < (born.month, born.day))

    @staticmethod
    def main():
        print("Saray's Chicken Farm Simulator V 0.5")
        while True:

            id = input("ID: ")
            name = input("Name: ")
            color = input("Color: ")
            born_on_date_str = input("Born on date (dd/mm/yyyy): ")

            try:
                born_on_date = datetime.strptime(born_on_date_str, '%d/%m/%Y')
            except ValueError:
                print("Invalid date format. Please use dd/mm/yyyy.")
                return

            age = FarmSimulator.calculate_age(born_on_date)
            molting = input("Molting (true/false): ")

            chicken = Chicken(id, name, color, age, molting, born_on_date)
            SaveToFile.save_chicken(chicken)
            print("Chicken ---> \n", chicken)
            another = input("Do you want to add another chicken? (y/n): ")
            if another.lower() != 'y':
                break

if __name__ == "__main__":
    FarmSimulator.main()
