from datetime import datetime
from Feline import Feline

# Ismael Travez, The Java Bandits, DCCO-ESPE

class Tiger(Feline):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)

    def feed(self, food):
        print("Feeding to a lion")
