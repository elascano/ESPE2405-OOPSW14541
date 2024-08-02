# zoo.py en ec_edu_espe_zoo_view
# David Rodriguez,THEJAVABANDITS DCCO-ESPE
import sys
import os

current_dir = os.path.dirname(os.path.abspath(__file__))
project_dir = os.path.dirname(current_dir)
sys.path.append(project_dir)

from ec_edu_espe_zoo_model.cage import Cage
from ec_edu_espe_zoo_model.food import Food
from ec_edu_espe_zoo_model.lion import Lion
from ec_edu_espe_zoo_model.monkey import Monkey
from ec_edu_espe_zoo_model.shark import Shark

def main():
    print("David's Rodriguez Zoo")
    cage_felines = Cage(1, "FelinesCage")
    cage_monkeys = Cage(2, "MonkeysCage")
    cage_birds = Cage(3, "BirdsCage")
    pool = Cage(4, "Pool for Shark")  # Corregido: Debe ser una instancia de Cage
    food = Food(1, "Fish")
    animals = []

    lion = Lion(True, 1, "Lion Alex", None, 'f', 0, cage_felines)
    lion.register(cage_felines)
    animals.append(lion)
    lion.feed_quantity(2, "rat")
    print("Lion -->", lion)

    animal = Monkey(2, "Monkey", None, 'f', 0, cage_monkeys)
    animal.feed("banana")
    animals.append(animal)
    print("Animal (monkey) -->", animal)

    animal = Lion(False, 2, "Lion Alexa", None, 'f', 0, cage_felines)
    animal.feed_quantity(4, "beef")
    animals.append(animal)
    print("Animal (lion) -->", animal)

    shark = Shark(1, "Dad Shark", None, 'f', 0, pool)
    shark.feed("fish")
    animals.append(shark)
    print("Animal (shark) -->", shark)

    print("Animals in David's Zoo -->")
    for animal in animals:
        print(animal)

if __name__ == "__main__":
    main()
