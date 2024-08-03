class Vehicle:
    def __init__(self, license_plate, model, brand, year, price, type):
        self.license_plate = license_plate
        self.model = model
        self.brand = brand
        self.year = year
        self.price = price
        self.type = type

class Car(Vehicle):
    def __init__(self, license_plate, model, brand, year, price, numberOfDoors):
        super().__init__(license_plate, model, brand, year, price, "Car")
        self.numberOfDoors = numberOfDoors

class Truck(Vehicle):
    def __init__(self, license_plate, model, brand, year, price, loadCapacity):
        super().__init__(license_plate, model, brand, year, price, "Truck")
        self.loadCapacity = loadCapacity
