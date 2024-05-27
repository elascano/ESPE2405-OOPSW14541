import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from datetime import datetime
from ec_edu_espe_farmsimulator_model.Chicken import Chicken

def main():
    print("Danny´s Chicken Farm Simulator v0.5")

    chicken1 = Chicken(1, "Lucy", "brown", 0, True, datetime.now)
    print(f"Chicken --> {chicken1}")

    id=2
    name="Maruja"
    color="black"
    age=1
    molting=False
    born_on_date=datetime.now()

    chicken2= Chicken(id, name, color, age, molting, born_on_date)
    print(f"Chicken -->{chicken2}")

    id=input("Enter chicken Id: ")
    name=input("Enter the name: ")
    color=input("Enter the chicken color: ")
    age=input("Enter the age of the chicken: ")
    molting=input("The chicken is molting? (0,1): ")
    born_on_date=input("Enter the date (dd/mm/yy): ")

if __name__== "__main__":
    main()


