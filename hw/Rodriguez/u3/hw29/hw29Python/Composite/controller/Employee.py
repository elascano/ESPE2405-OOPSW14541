from abc import ABC, abstractmethod

class Employee(ABC):
    def __init__(self, name="not assigned yet", title="not assigned yet"):
        self.name = name
        self.title = title

    def state_name(self):
        print(f"{self.title} {self.name}")

    @abstractmethod
    def add(self, employee):
        pass

    @abstractmethod
    def remove(self, employee):
        pass