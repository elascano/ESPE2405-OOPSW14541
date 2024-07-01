import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from datetime import datetime
from ec_edu_espe_farmsimulator_model.Chicken import Chicken
from ec_edu_espe_farmsimulator_utils.FileManager import FileManager

def main():
    print()
    chicken_File = FileManager

    print("Danny´s Chicken Farm Simulator V 0.5\n")

    chicken1 = Chicken(1, "Mariela", "brown", 0, True, datetime.now)
    properties = chicken1.__str__()   
    chicken_File= FileManager(properties)
    print(properties)
    chicken_File.save()
    
    print()

if __name__== "__main__":
    main()


