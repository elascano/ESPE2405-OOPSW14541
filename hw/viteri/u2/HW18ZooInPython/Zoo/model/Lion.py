from datetime import date
from model.Feline import Feline
from model.Cage import Cage
from model.Food import Food

class Lion(Feline):
    def __init__(self, id, description, born_on_date, gender, cage, number_of_bones, vertebrate, mane=False):
        super().__init__(id, description, born_on_date, gender, cage, number_of_bones, vertebrate)
        self._mane = mane

    def __str__(self):
        return f"Lion{{mane={self._mane}, {super().__str__()}}}"

    @property
    def mane(self):
        return self._mane

    @mane.setter
    def mane(self, value):
        self._mane = value

    def feed(self, food_amount):
        print(f"Feeding the lion with {food_amount} mice")

    def feed_with_food(self, food):
        print(f"Feeding the lion with {food}")

# For compatibility with Java code, you may use a separate feed method
# for handling the Food object if you wish to mimic Java overloading.
