import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_farmsimulator_model.Chicken import Chicken

class SaveToFile:
    def save_chicken(chicken):
        filename = "chicken_data.txt"  
        try:
            with open(filename, "w") as file:  
                file.write(f"ID: {chicken.id}\n")
                file.write(f"Name: {chicken.name}\n")
                file.write(f"Color: {chicken.color}\n")
                file.write(f"Age: {chicken.age}\n")
                file.write(f"Molting: {chicken.molting}\n")
                file.write(f"Born on Date: {chicken.born_on_date}\n")
            print(f"Chicken data has been saved")
        except FileNotFoundError:
            print(f"Error: Could not find file {filename}.")
        except Exception as e:  
            print(f"Error saving chicken information: {e}")