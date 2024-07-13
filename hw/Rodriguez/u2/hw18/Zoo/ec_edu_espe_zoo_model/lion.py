from .feline import Feline
from datetime import date
from .cage import Cage

class Lion(Feline):
    def __init__(self, mane, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)
        self.mane = mane

    def __str__(self):
        return f"Lion(mane={self.mane}, {super().__str__()})"

    def feed(self, food):
        print(f"Feeding a Lion with {food} rats")

    def feed_quantity(self, quantity, food):
        print(f"Feeding the lion with {quantity} {food}s")
