import sys
import os


sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.Employee import Employee


class Teller(Employee):
    def __init__(self, name):
        super().__init__(name, "Teller")

    def add(self, employee):
        pass  

    def remove(self, employee):
        pass  