import datetime
import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_farmsimulator_model.Chicken import Chicken

class FarmSimulator:
    def main():
        print("Saray's Chicken Farm Simulator V 0.5")

        chicken_1 = Chicken(1, "Lucy", "white and brown", 0, True, datetime.date.today())
        print(f"Chicken ---> \n", chicken_1)

        id = 2
        name = "Maruja"
        color = "black"
        age = 1
        molting = False
        born_on_date = datetime.date.today()

        chicken_2 = Chicken(id, name, color, age, molting, born_on_date)
        print("Chicken ---> \n", chicken_2)

if __name__ == "__main__":
    FarmSimulator.main()
