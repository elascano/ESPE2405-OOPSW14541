import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from sorting_strategy import SortingStrategy

class QuickSort(SortingStrategy):
    def sort(self, data):
        self._quicksort(data, 0, len(data) - 1)
        return data

    def _quicksort(self, data, low, high):
        if low < high:
            pi = self._partition(data, low, high)
            self._quicksort(data, low, pi - 1)
            self._quicksort(data, pi + 1, high)

    def _partition(self, data, low, high):
        pivot = data[high]
        i = low - 1
        for j in range(low, high):
            if data[j] <= pivot:
                i += 1
                data[i], data[j] = data[j], data[i]

        data[i + 1], data[high] = data[high], data[i + 1]
        return i + 1
