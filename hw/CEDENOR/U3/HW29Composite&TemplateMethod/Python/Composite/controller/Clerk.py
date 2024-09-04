import sys
import os
# Nahomi Cedeño, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.Employee import Employee

class Clerk(Employee):
    def __init__(self, name):
        super().__init__(name, "Clerk")

    def add(self, employee):
        pass  # No operation for leaf nodes

    def remove(self, employee):
        pass  # No operation for leaf nodes