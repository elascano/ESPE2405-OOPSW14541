import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_zoo_model.Feline import Feline

# Ismael Travez, The Java Bandits, DCCO-ESPE

class Lion(Feline):
    def __init__(self, mane, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)
        self._mane = mane

    def __str__(self):
        return f'Lion(mane={self._mane}, {super().__str__()})'

    def feed(self, food):
        print(f"\nFeeding a Lion with {food} rats")

    def feed_with_food(self, quantity, food):
        print(f"Feeding the lion with {quantity} {food}")

    @property
    def mane(self):
        return self._mane

    @mane.setter
    def mane(self, mane):
        self._mane = mane