import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_farmsimulator_model.Chicken import Chicken

class SaveToFile:
    @staticmethod
    def save_chicken(chicken):
        filename = "chicken_data.txt"
        try:
            with open(filename, "a") as file:  
                file.write(f"Chicken{{id={chicken.id}, name={chicken.name}, color={chicken.color}, "
                           f"age={chicken.age}, molting={chicken.molting}, "
                           f"bornOnDate={chicken.born_on_date}}}\n")
            print("Chicken data has been saved")
        except FileNotFoundError:
            print(f"Error: Could not find file {filename}.")
        except Exception as e:
            print(f"Error saving chicken information: {e}")
