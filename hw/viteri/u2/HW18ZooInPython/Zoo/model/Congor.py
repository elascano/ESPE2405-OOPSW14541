from datetime import date
from model.Bird import Bird
from model.Cage import Cage

class Condor(Bird):
    def __init__(self, mountain, id, description, born_on_date, gender, cage, number_of_bones, vertebrate):
        super().__init__(id, description, born_on_date, gender, cage, number_of_bones, vertebrate)
        self._mountain = mountain

    def __str__(self):
        return f"Condor{{mountain='{self._mountain}', {super().__str__()}}}"

    @property
    def mountain(self):
        return self._mountain

    @mountain.setter
    def mountain(self, value):
        self._mountain = value

    def feed(self, food_amount):
        print(f"Feeding the condor with {food_amount} units of food")