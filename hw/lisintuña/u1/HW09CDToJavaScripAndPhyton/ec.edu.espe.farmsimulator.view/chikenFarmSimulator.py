# author:
#     Cristian Lisintuña, TheJavaBandits, DCCO-ESPE

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
        return (f"Chicken [ID={self.id}, Name={self.name}, Color={self.color}, "
                f"Age={self.age}, Molting={self.molting}, Born On={self.born_on_date}]")

class ChickenFarmSimulator:
    @staticmethod
    def main():
        print("cristian Chicken Farm Simulator V 0.5")

        chicken1 = Chicken(1, "Lucy", "brown", 1, True, datetime.now())
        print("Chicken 1 --> " + str(chicken1))

        id = 2
        name = "Maruja"
        color = "black"
        age = 1
        molting = False
        born_on_date = datetime.now()

        chicken2 = Chicken(id, name, color, age, molting, born_on_date)
        print("Chicken 2 --> " + str(chicken2))

if __name__ == "__main__":
    ChickenFarmSimulator.main()
