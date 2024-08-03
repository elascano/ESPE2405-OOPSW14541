from datetime import date
from model.Food import Food
from model.Cage import Cage
from model.Lion import Lion
from model.Monkey import Monkey

def main():
    print("Alexis's Zoo")

    food = Food(3, "fish")
    cage_felines = Cage(1, "felinesCage")
    cage_monkeys = Cage(2, "monkeysCage")
    cage_birds = Cage(3, "birdsCage")
    pool = Cage(4, "SharkCage")

    lion = Lion(1, "Alex el Leon", date(2024, 10, 10), 'm', 0, cage_felines, 0, True)
    lion.register(cage_felines)
    lion.feed(5)
    print(f"animal(lion)--->{lion}")

    monkey = Monkey(4, "Pancho" , 10-20-2024, "m" , 2, 23, True)
    monkey.register(pool)
    monkey.feed(4)
    print(f"animal(Monkey)---->{monkey}")

if __name__ == "__main__":
    main()