import sys
import os


# Agrega el directorio principal del proyecto al path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

# Archivo: zoo.py

from abc import ABC, abstractmethod
from datetime import date

# Clase abstracta Animal
class Animal(ABC):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        self.id = id
        self.description = description
        self.date_onborn = date_onborn
        self.gender = gender
        self.number_of_bones = number_of_bones
        self.cage = cage
    
    @abstractmethod
    def feed(self, food):
        pass
    
    def register(self, cage):
        print(f"Register the animal ---> {type(self).__name__} in cage {cage}")
    
    def __str__(self):
        return f"Animal(id={self.id}, description={self.description}, date_onborn={self.date_onborn}, gender={self.gender}, number_of_bones={self.number_of_bones}, cage={self.cage})"


# Clase abstracta Mamífero que hereda de Animal
class Mammal(Animal, ABC):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)

# Clase abstracta Ave que hereda de Animal
class Bird(Animal, ABC):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)

# Clase abstracta Peces que hereda de Animal
class Fish(Animal, ABC):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)

# Clase abstracta Peces que hereda de Mammmal
class Primate(Mammal, ABC):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)

# Clase abstracta Peces que hereda de Mammmal
class Feline(Mammal, ABC):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)

# Clase de Jaulas
class Cage:
    def __init__(self, id, type):
        self.id = id
        self.type = type
    
    def __str__(self):
        return f"Cage(id={self.id}, type={self.type})"

# Clase de Comida
class Food:
    def __init__(self, id, description):
        self.id = id
        self.description = description
    
    def __str__(self):
        return f"Food(id={self.id}, description={self.description})"

# Clase León que hereda de Felino
class Lion(Feline):
    def __init__(self, mane, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)
        self.mane = mane
    
    def feed(self, quantity, food):
        print(f"Feeding the lion with {quantity} {food}(s)")
    
    def __str__(self):
        return f"Lion(mane={self.mane}, {super().__str__()})"

# Clase León que hereda de Felino 
class Tiger(Feline):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)
    
    def feed(self, food):
        print("Feeding a Tiger")

# Clase Mono que hereda de Primates
class Monkey(Primate):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)
    
    def feed(self, food):
        print("Feeding a monkey")

# Clase Tiburón que hereda de Peces
class Shark(Fish):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)
    
    def feed(self, food):
        print("Feeding a Shark")

#Ejecución del programa

if __name__ == "__main__":
    print("Abner's Zoo")
    
    # Creación de jaulas y comida
    cage_felines = Cage(1, "Felines Cage")
    cage_monkeys = Cage(2, "Monkeys Cage")
    pool = Cage(3, "Pool for Sharks")
    food = Food(1, "Fish")
    
    # Lista de animales
    animals = []
    
    # Creación de animales y operaciones
    lion = Lion(True, 1, "Lion Alex", date(2024, 10, 10), 'f', 0, cage_felines)
    lion.register(cage_felines)
    animals.append(lion)
    lion.feed(2, food)
    lion.feed(3, food)
    print(f"Lion --> {lion}")
    
    animal = Monkey(2, "Bear", date(2024, 5, 3), 'f', 0, cage_monkeys)
    animal.feed("Banana")
    animals.append(animal)
    print(f"Animal (monkey) --> {animal}")
    
    animal = Lion(False, 2, "Lion Alexa", date(2024, 5, 3), 'f', 0, cage_felines)
    animal.feed(4, food)
    animals.append(animal)
    print(f"Animal (lion) --> {animal}")

    shark = Shark(1, "Dad Shark", date(2024, 6, 7), 'f', 0, pool)
    shark.feed("Fish")
    animals.append(shark)
    print(f"Animal (shark) --> {shark}")
    
    # Imprimir todos los animales en el zoológico
    print("Animals in Abner's Zoo -->")
    for animal in animals:
        print(animal)
