from datetime import datetime
from Bird import Bird

class Condor(Bird):
    def __init__(self, mountains, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)
        self._mountains = mountains

    def __str__(self):
        return f"Condor(mountains={self._mountains}, {super().__str__()})"

    def feed(self, food):
        raise NotImplementedError("Not supported yet.")

    @property
    def mountains(self):
        return self._mountains

    @mountains.setter
    def mountains(self, mountains):
        self._mountains = mountains
