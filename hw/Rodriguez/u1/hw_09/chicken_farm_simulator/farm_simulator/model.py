# farm_simulator/model.py
from datetime import datetime

class Chicken:
    def __init__(self, id, name, color, age, molting, born_on_date):
        self.id = id
        self.name = name
        self.color = color
        self.age = age
        self.molting = molting
        self.born_on_date = born_on_date

    def __str__(self):
        return (f"Chicken{{id={self.id}, name={self.name}, color={self.color}, "
                f"age={self.age}, molting={self.molting}, born_on_date={self.born_on_date}}}")

    # Getter and Setter methods
    @property
    def id(self):
        return self._id

    @id.setter
    def id(self, id):
        self._id = id

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, name):
        self._name = name

    @property
    def color(self):
        return self._color

    @color.setter
    def color(self, color):
        self._color = color

    @property
    def age(self):
        return self._age

    @age.setter
    def age(self, age):
        self._age = age

    @property
    def molting(self):
        return self._molting

    @molting.setter
    def molting(self, molting):
        self._molting = molting

    @property
    def born_on_date(self):
        return self._born_on_date

    @born_on_date.setter
    def born_on_date(self, born_on_date):
        self._born_on_date = born_on_date