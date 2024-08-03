from datetime import date
from model.Animal import Animal
from model.Cage import Cage

class Bird(Animal):
    def __init__(self, id, description, born_on_date, gender, cage, number_of_bones, vertebrate):
        super().__init__(id, description, born_on_date, gender, cage, number_of_bones, vertebrate)
