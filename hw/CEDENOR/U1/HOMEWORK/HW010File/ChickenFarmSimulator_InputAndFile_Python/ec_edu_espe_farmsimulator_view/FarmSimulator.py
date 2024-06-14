import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_farmsimulator_model.Chicken import Chicken
from ec_edu_espe_farmsimulator_controller.SaveToFile import SaveToFile

class FarmSimulator:
    def main():
        print("Nahomi's Chicken Farm Simulator V 0.5")

        id = input ("ID: ")
        name = input ("Name: ")
        color = input ("Color: ")
        age = input ("Age: ")
        molting = input ("Molting (true/false): ")
        born_on_date = input ("Born on date (dd/mm/yyyy): ")

        chicken = Chicken(id, name, color, age, molting, born_on_date)
        SaveToFile.save_chicken(chicken)  
        print("Chicken ---> \n", chicken)
if __name__ == "__main__":
    FarmSimulator.main()