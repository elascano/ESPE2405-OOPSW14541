import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from sorting_strategy import SortingStrategy
from bubble_sort import BubbleSort
from quick_sort import QuickSort
from insertion_sort import InsertionSort

class SortingContext:
    def __init__(self):
        self.sorting_strategy = None

    def sort(self, data):
        size = len(data)
        self.sorting_strategy = self.set_sort_strategy(size)
        return self.sorting_strategy.sort(data)

    def set_sort_strategy(self, n):
        if 2 < n < 5:
            self.sorting_strategy = BubbleSort()
            print("Sorting by Bubble Sort")
        elif 2<= n < 5:
            self.sorting_strategy = InsertionSort()
            print("Sorting by Insertion Sort")
        elif 6 >= 10:
            self.sorting_strategy = QuickSort()
            print("Sorting by Quick Sort")
        return self.sorting_strategy
