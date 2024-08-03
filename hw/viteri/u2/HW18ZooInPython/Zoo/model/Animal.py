from abc import ABC, abstractmethod
from datetime import date
from model.Cage import Cage

class Animal(ABC):
    def __init__(self, id, description, born_on_date, gender, cage, number_of_bones, vertebrate):
        self._id = id
        self._description = description
        self._born_on_date = born_on_date
        self._gender = gender
        self._cage = cage
        self._number_of_bones = number_of_bones
        self._vertebrate = vertebrate

    def __str__(self):
        return (f"Animal{{id={self._id}, description='{self._description}', born_on_date={self._born_on_date}, "
                f"gender='{self._gender}', cage={self._cage}, number_of_bones={self._number_of_bones}, "
                f"vertebrate={self._vertebrate}}}")

    def register(self, cage):
        print(f"Registering the animal ====> {self.__class__.__name__} in cage {cage}")

    @abstractmethod
    def feed(self, food_amount):
        pass

    @property
    def id(self):
        return self._id

    @id.setter
    def id(self, value):
        self._id = value

    @property
    def description(self):
        return self._description

    @description.setter
    def description(self, value):
        self._description = value

    @property
    def born_on_date(self):
        return self._born_on_date

    @born_on_date.setter
    def born_on_date(self, value):
        self._born_on_date = value

    @property
    def gender(self):
        return self._gender

    @gender.setter
    def gender(self, value):
        self._gender = value

    @property
    def cage(self):
        return self._cage

    @cage.setter
    def cage(self, value):
        self._cage = value

    @property
    def number_of_bones(self):
        return self._number_of_bones

    @number_of_bones.setter
    def number_of_bones(self, value):
        self._number_of_bones = value

    @property
    def vertebrate(self):
        return self._vertebrate

    @vertebrate.setter
    def vertebrate(self, value):
        self._vertebrate = value