from datetime import datetime
from Feline import Feline

class Tiger(Feline):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)

    def feed(self, food):
        print("Feeding to a lion")
