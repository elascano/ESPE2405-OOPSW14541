from abc import ABC, abstractmethod
from typing import List

class SortingStrategy(ABC):
    
    @abstractmethod
    def sort(self, data: List[int]) -> List[int]:
        pass
