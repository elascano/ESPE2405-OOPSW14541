from abc import ABC, abstractmethod
from typing import List

from Bubble_Sort import Bubble_Sort


class SortingContext:
    
    def __init__(self):
        self._strategy = None
    
    def _select_strategy(self, data: List[int]):
        size = len(data)
        if 2 <= size <= 5:
            self._strategy = BubbleSort()
        elif 6 <= size <= 10:
            self._strategy = InsertionSort()
        else:
            self._strategy = QuickSort()
    
    def sort_data(self, data: List[int]) -> List[int]:
        self._select_strategy(data)
        return self._strategy.sort(data)