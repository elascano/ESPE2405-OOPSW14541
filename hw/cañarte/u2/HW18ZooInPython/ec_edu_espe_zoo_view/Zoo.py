from datetime import datetime
import sys
import os
# Saray Cañarte, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_zoo_model.Cage import Cage
from ec_edu_espe_zoo_model.Food import Food
from ec_edu_espe_zoo_model.Lion import Lion
from ec_edu_espe_zoo_model.Monkey import Monkey
from ec_edu_espe_zoo_model.Shark import Shark

if __name__ == "__main__":
    print("Saray's Zoo \n")
    
    cage_felines = Cage(1, "FelinesCage")
    cage_monkeys = Cage(2, "MonkeysCage")
    cage_birds = Cage(3, "BirdsCage")
    pool = Cage(4, "Pool for Shark")
    
    food = Food(1, "Fish")
    
    animals = []
    
    lion_pedro = Lion(True, 1, "Lion Pedro", datetime(2024, 10, 10), 'f', 0, cage_felines)
    lion_pedro.register(cage_felines)
    animals.append(lion_pedro)
    lion_pedro.feed(2)
    lion_pedro.feed_with_food(3, food)
    print("Lion -->", lion_pedro)
    
    monkey_bear = Monkey(2, "Bear", datetime(2024, 5, 3), 'f', 0, cage_monkeys)
    monkey_bear.feed(5)
    animals.append(monkey_bear)
    print("Animal (monkey) -->", monkey_bear)
    
    lion_juancho = Lion(False, 2, "Lion Juancho", datetime(2024, 5, 3), 'm', 0, cage_felines)
    lion_juancho.feed(4)
    animals.append(lion_juancho)
    print("Animal (lion) -->", lion_juancho)
    
    shark_pepe = Shark(1, "Shark Pepe", datetime(2024, 6, 7), 'm', 0, pool)
    shark_pepe.feed(6)
    animals.append(shark_pepe)
    print("Animal (shark) -->", shark_pepe)
    
    print("\nAnimals in Saray's Zoo -->")
    for animal in animals:
        print(animal)
