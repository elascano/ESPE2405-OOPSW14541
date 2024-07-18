from .animal import Animal
from datetime import date
from .cage import Cage

class Mammal(Animal):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)
