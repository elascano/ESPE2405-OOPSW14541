import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from sorting_strategy import SortingStrategy

class InsertionSort(SortingStrategy):
    def sort(self, data):
        n = len(data)
        for i in range(1, n):
            key = data[i]
            j = i - 1

            while j >= 0 and data[j] > key:
                data[j + 1] = data[j]
                j -= 1
            data[j + 1] = key
            
        return data
