# farm_simulator/view.py
from datetime import datetime
from farm_simulator.model import Chicken

def main():
    print("David chicken Farm Simulator V 0.5")

    chicken_list = []

    while True:
        id = int(input("Enter chicken ID: "))
        name = input("Enter chicken name: ")
        color = input("Enter chicken color: ")
        age = int(input("Enter chicken age: "))
        molting = input("Is the chicken molting? (yes/no): ").strip().lower() == 'yes'
        born_on_date = datetime.now()

        chicken = Chicken(id, name, color, age, molting, born_on_date)
        chicken_list.append(chicken)
        print(f"Chicken --> \n{chicken}")

        another = input("Do you want to add another chicken? (yes/no): ").strip().lower()
        if another != 'yes':
            break

    save_chickens_to_file(chicken_list)

def save_chickens_to_file(chickens):
    with open('chickens.txt', 'w') as file:
        for chicken in chickens:
            file.write(f"{chicken}\n")

if __name__ == "__main__":
    main()