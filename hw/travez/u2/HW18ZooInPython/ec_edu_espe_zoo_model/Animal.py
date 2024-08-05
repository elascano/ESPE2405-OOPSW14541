import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from abc import ABC, abstractmethod
from datetime import datetime

# Ismael Travez, The Java Bandits, DCCO-ESPE

class Animal(ABC):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        self.id = id
        self.description = description
        self.date_onborn = date_onborn
        self.gender = gender
        self.number_of_bones = number_of_bones
        self.cage = cage

    def __str__(self):
        return f"Animal(id={self.id}, description={self.description}, date_onborn={self.date_onborn}, gender={self.gender}, number_of_bones={self.number_of_bones}, cage={self.cage})"

    @abstractmethod
    def feed(self, food):
        pass

    def register(self, cage):
        print(f"Register the animal ---> {self.__class__.__name__} in cage {cage}")

    @property
    def id(self):
        return self._id

    @id.setter
    def id(self, id):
        self._id = id

    @property
    def description(self):
        return self._description

    @description.setter
    def description(self, description):
        self._description = description

    @property
    def date_onborn(self):
        return self._date_onborn

    @date_onborn.setter
    def date_onborn(self, date_onborn):
        self._date_onborn = date_onborn

    @property
    def gender(self):
        return self._gender

    @gender.setter
    def gender(self, gender):
        self._gender = gender

    @property
    def number_of_bones(self):
        return self._number_of_bones

    @number_of_bones.setter
    def number_of_bones(self, number_of_bones):
        self._number_of_bones = number_of_bones

    @property
    def cage(self):
        return self._cage

    @cage.setter
    def cage(self, cage):
        self._cage = cage
