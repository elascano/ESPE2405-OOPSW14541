import sys
import os
# Nahomi Cedeño, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.Tea import Tea
from controller.Coffee import Coffee

def main():
    tea = Tea()
    coffee = Coffee()

    print("Making tea ...")
    tea.prepare_recipe()

    print("--------------------\n")

    print("Making coffee ...")
    coffee.prepare_recipe()

if __name__ == "__main__":
    main()