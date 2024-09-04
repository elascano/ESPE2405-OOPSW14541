
import sys
import os
# Nahomi Cedeño, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.CoffeeinBeverage import CoffeeinBeverage

class Coffee(CoffeeinBeverage):
    def brew(self):
        print("Dripping coffee through filter")

    def add_condiments(self):
        print("Adding sugar and milk")

    def wants_condiments(self):
        answer = self.get_user_input("Would you like milk and sugar with your coffee (y/n)? ")
        return answer.lower().startswith('y')

    def get_user_input(self, prompt):
        try:
            return input(prompt)
        except Exception as e:
            print("An error occurred while trying to read your input. Please try again.")
            return "no"
