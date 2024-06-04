from datetime import datetime

class Chicken:
    def __init__(self, id, name, color, age, molting, born_on_date):
        self.id = id
        self.name = name
        self.color = color
        self.age = age
        self.molting = molting
        self.born_on_date = born_on_date

    def __str__(self):
        return f"Chicken(id={self.id}, name={self.name}, color={self.color}, age={self.age}, molting={self.molting}, born_on_date={self.born_on_date})"

class FarmSimulator:
    @staticmethod
    def print_chicken_info(chicken):
        print(chicken)

    @staticmethod
    def main():
        print("Yuliana's Chicken Farm Simulator V 0.5")
        chicken1 = Chicken(1, "Lucy", "brown", 0, True, datetime.now())
        print("Chicken 1 -->")
        FarmSimulator.print_chicken_info(chicken1)

        id = 2
        name = "Maruja"
        color = "black"
        age = 1
        molting = False
        born_on_date = datetime.now()

        chicken2 = Chicken(id, name, color, age, True, born_on_date)
        print("Chicken 2 -->")
        FarmSimulator.print_chicken_info(chicken2)

# Llama al método main
FarmSimulator.main()
