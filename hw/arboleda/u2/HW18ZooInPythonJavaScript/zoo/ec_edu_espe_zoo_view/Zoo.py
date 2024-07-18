import sys
import os

# Agrega el directorio principal del proyecto al path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from datetime import datetime
from ec_edu_espe_zoo_model.Cage import Cage
from ec_edu_espe_zoo_model.Food import Food
from ec_edu_espe_zoo_model.Lion import Lion
from ec_edu_espe_zoo_model.Monkey import Monkey
from ec_edu_espe_zoo_model.Shark import Shark


class Zoo:
    def main(self):
        print("Abner's Zoo")
        
        cage_felines = Cage(1, "FelinesCage")
        cage_monkeys = Cage(2, "MonkeysCage")
        cage_birds = Cage(3, "BirdsCage")
        pool = Cage(4, "Pool for Shark")
        food = Food(1, "Fish")
        animals = []
        
        lion = Lion(True, 1, "Lion Alex", datetime(2024, 10, 10), 'f', 0, cage_felines)
        lion.register(cage_felines)
        animals.append(lion)
        lion.Feed(2)
        lion.feed(3, food)
        print("Lion -->", lion)
        
        animal = Monkey(2, "Bear", datetime(2024, 5, 3), 'f', 0, cage_monkeys)
        animal.Feed(5)
        animals.append(animal)
        print("Animal (monkey) -->", animal)
        
        animal = Lion(False, 2, "Lion Alexa", datetime(2024, 5, 3), 'f', 0, cage_felines)
        animal.Feed(4)
        animals.append(animal)
        print("Animal (lion) -->", animal)
        
        shark = Shark(1, "Dad Shark", datetime(2024, 6, 7), 'f', 0, pool)
        shark.Feed(6)
        animals.append(shark)
        print("Animal (shark) -->", shark)
        
        print("Animals in Abner's Zoo -->")
        for animal in animals:
            print(animal)

# Ejecución del programa
if __name__ == "__main__":
    zoo = Zoo()
    zoo.main()
