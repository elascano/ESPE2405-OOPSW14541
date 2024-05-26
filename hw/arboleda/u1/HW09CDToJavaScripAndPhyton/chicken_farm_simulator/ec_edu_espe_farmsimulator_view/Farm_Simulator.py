import sys
import os

# Agrega el directorio principal del proyecto al path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from datetime import datetime
from ec_edu_espe_farmsimulator_model.Chicken import Chicken


def main():
    print("Abner´s Chicken Farm Simulator V0.5")
        
    chicken1 = Chicken(1, "Lucy", "brown", 0, True, datetime.now())
    print(f"Chicken --> {chicken1}")
        
    id = 2
    name = "Maruja"
    color = "black"
    age = 1
    molting = False
    born_on_date = datetime.now()
        
    chicken2 = Chicken(id, name, color, age, molting, born_on_date)
    print(f"Chicken2 --> {chicken2}")
    
if __name__ == "__main__":
    main()
