import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from Animal import Animal

# Saray Cañarte, codecreators, DCCO - ESPE

class Bird(Animal):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)
