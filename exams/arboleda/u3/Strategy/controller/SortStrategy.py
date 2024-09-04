from abc import ABC, abstractmethod

# Strategy Interface
class SortStrategy(ABC):
    @abstractmethod
    def sort(self, data):
        pass
