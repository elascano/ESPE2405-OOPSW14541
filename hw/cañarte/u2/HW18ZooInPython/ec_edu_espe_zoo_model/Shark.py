import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_zoo_model.Fish import Fish

class Shark(Fish):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)

    def feed(self, food):
        print(f"\nFeeding a Shark with {food} fish")

