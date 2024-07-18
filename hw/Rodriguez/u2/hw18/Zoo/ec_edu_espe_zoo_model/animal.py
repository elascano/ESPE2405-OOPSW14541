from abc import ABC, abstractmethod
from datetime import date
from .cage import Cage

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

    def get_id(self):
        return self.id

    def set_id(self, id):
        self.id = id

    def get_description(self):
        return self.description

    def set_description(self, description):
        self.description = description

    def get_date_onborn(self):
        return self.date_onborn

    def set_date_onborn(self, date_onborn):
        self.date_onborn = date_onborn

    def get_gender(self):
        return self.gender

    def set_gender(self, gender):
        self.gender = gender

    def get_number_of_bones(self):
        return self.number_of_bones

    def set_number_of_bones(self, number_of_bones):
        self.number_of_bones = number_of_bones

    def get_cage(self):
        return self.cage

    def set_cage(self, cage):
        self.cage = cage
