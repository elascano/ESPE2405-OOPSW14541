from datetime import date
from model.Mammal import Mammal
from model.Cage import Cage

class Feline(Mammal):
    def __init__(self, id, description, born_on_date, gender, cage, number_of_bones, vertebrate):
        super().__init__(id, description, born_on_date, gender, cage, number_of_bones, vertebrate)
