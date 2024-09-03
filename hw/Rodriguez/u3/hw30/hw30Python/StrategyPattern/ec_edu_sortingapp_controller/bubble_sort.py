import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from sorting_strategy import SortingStrategy

class BubbleSort(SortingStrategy):
    def sort(self, data):
        n = len(data)
        for i in range(n - 1):
            for j in range(n - i - 1):
                if data[j] > data[j + 1]:
                    self.swap(data, j, j + 1)
        return data

    def swap(self, arr, i, j):
        temp = arr[j]
        arr[j] = arr[j + 1]
        arr[j + 1] = temp
