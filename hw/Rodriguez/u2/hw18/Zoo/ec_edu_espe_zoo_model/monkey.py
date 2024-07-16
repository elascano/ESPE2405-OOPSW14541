from .primate import Primate
from datetime import date
from .cage import Cage

class Monkey(Primate):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)

    def feed(self, food):
        print("Feeding a monkey")
