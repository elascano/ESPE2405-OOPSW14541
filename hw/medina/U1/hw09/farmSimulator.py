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
        return f"Chicken{{id={self.id}, name='{self.name}', color='{self.color}', age={self.age}, molting={self.molting}, bornOnDate={self.born_on_date}}}"

if __name__ == "__main__":
    print("Simone's Chicken Farm Simulator V 0.5")
    chicken = Chicken(1, "Lucy", "white and brown", 0, True, datetime.now())
    
    print("chicken 1--> \n", chicken)

    id = 2
    name = "Maruja"
    color = "black"
    age = 1
    molting = False
    born_on_date = datetime.now()

    chicken = Chicken(id, name, color, age, molting, born_on_date)
    print("chicken 2--> \n", chicken)
    chicken1 = Chicken(1, "Josefina", "brown", 3, False, datetime.now())
    print("chicken 3--> \n", chicken1)
