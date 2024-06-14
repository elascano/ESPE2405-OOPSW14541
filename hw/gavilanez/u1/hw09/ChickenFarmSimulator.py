class ChickenFarmSimulator:
    def __init__(self, id, name, color, age, molting, bornOnDate):
        self.id = id
        self.name = name
        self.color = color
        self.age = age
        self.molting = molting
        self.bornOnDate = bornOnDate

    def view(self):
        print("id:{} name:{} color:{} age:{} molting:{} bornOnDate:{}".format (chicken1.id, chicken1.name, chicken1.color, chicken1.age, chicken1.molting, chicken1.bornOnDate))
chicken1 = ChickenFarmSimulator("1", "Lucy", "White and brown", 0, True, None)
chicken2 = ChickenFarmSimulator("2", "Maruja", "black", 1, False, None) 
chicken1.view()

files = open("Chicken.txt", "w")
files.write("Kenny's Chicken Farm Simulator V 0.5 \n")
files.write("Id : 1 \n")
files.write("Name : Lucy \n")
files.write("Color : white and brown \n")
files.write("Age : 0 \n")
files.write("Molting : True \n")
files.write("borOnDate : None \n")
files.close()