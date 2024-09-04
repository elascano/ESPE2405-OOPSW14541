from bubble_sort import BubbleSort
from insertion_sort import InsertionSort
from quick_sort import QuickSort

class SortingContext:
    def __init__(self):
        self.ss = None

    def sort(self, data):
        size = len(data)
        self.ss = self.set_sort_strategy(size)
        return self.ss.sort(data)

    def set_sort_strategy(self, n):
        if 0 < n < 30:
            self.ss = BubbleSort()
        elif 30 <= n < 100:
            self.ss = InsertionSort()
        elif n >= 100:
            self.ss = QuickSort()
        return self.ss

