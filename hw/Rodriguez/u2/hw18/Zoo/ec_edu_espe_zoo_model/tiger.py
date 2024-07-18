from .feline import Feline
from datetime import date
from .cage import Cage

class Tiger(Feline):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)

    def feed(self, food):
        raise NotImplementedError("Subclasses should implement this method")
