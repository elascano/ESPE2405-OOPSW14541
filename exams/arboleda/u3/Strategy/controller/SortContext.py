from controller import BubbleSort
from controller import InsertionSort
from controller import QuickSort

class SortContext:
    def __init__(self, data):
        self.data = data
        self.strategy = self.choose_strategy()

    def choose_strategy(self):
        size = len(self.data)
        if 2 <= size <= 5:
            return BubbleSort()
        elif 6 <= size <= 10:
            return InsertionSort()
        elif size > 11:
            return QuickSort()
        else:
            raise ValueError("Array must have more than 1 element.")

    def sort(self):
        return self.strategy.sort(self.data)