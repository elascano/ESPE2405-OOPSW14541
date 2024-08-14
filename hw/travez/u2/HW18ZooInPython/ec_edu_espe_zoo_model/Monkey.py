import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_zoo_model.Primate import Primate

# Ismael Travez, The Java Bandits, DCCO-ESPE

class Monkey(Primate):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)

    def feed(self, food):
        print(f"\nFeeding a Monkey with {food} fruits")

