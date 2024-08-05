from .mammal import Mammal
from datetime import date
from .cage import Cage

class Feline(Mammal):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)
