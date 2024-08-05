from .bird import Bird
from datetime import date
from .cage import Cage

class Condor(Bird):
    def __init__(self, mountains, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)
        self.mountains = mountains

    def __str__(self):
        return f"Condor(mountains={self.mountains}, {super().__str__()})"

    def feed(self, food):
        raise NotImplementedError("Subclasses should implement this method")
