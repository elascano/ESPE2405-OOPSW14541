from datetime import date
from model.Bird import Bird
from model.Cage import Cage

class Eagle(Bird):
    def __init__(self, id, description, born_on_date, gender, cage, number_of_bones, vertebrate):
        super().__init__(id, description, born_on_date, gender, cage, number_of_bones, vertebrate)

    def feed(self, food_amount):
        print(f"Feeding the eagle with {food_amount} units of food")
