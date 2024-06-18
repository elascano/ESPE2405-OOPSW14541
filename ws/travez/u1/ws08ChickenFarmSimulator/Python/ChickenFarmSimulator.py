from datetime import date
from Chicken import Chicken

def main():
    print("Hello chickens from Ismael Travez \nChicken Farm Simulator 2K24 V 0.1")

    chicken = Chicken(1, "Lucy", "Black", 1, True, date.today())
    print(f"Chicken --> {chicken}")

    id = 2
    name = "Maruja"
    color = "white"
    age = 0
    molting = False
    born_on_date = date.today()

    chicken = Chicken(id, name, color, age, molting, born_on_date)
    print(f"Chicken --> {chicken}")

if __name__ == "__main__":
    main()
