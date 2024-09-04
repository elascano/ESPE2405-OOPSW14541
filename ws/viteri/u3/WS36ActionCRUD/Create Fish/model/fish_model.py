# model/fish.py

class Fish:
    def __init__(self, name, species, age):
        self.name = name
        self.species = species
        self.age = age

    def to_dict(self):
        return {
            "name": self.name,
            "species": self.species,
            "age": self.age
        }