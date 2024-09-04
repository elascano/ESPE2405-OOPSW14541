import sys
import os
from abc import ABC, abstractmethod
from typing import List

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

class SortingStrategy(ABC):
    
    @abstractmethod
    def sort(self, data: List[int]) -> List[int]:
        pass

class BubbleSort(SortingStrategy):
    
    def sort(self, data: List[int]) -> List[int]:
        arr = data.copy()
        n = len(arr)
        for i in range(n):
            for j in range(0, n-i-1):
                if arr[j] > arr[j+1]:
                    arr[j], arr[j+1] = arr[j+1], arr[j]
        return arr

class QuickSort(SortingStrategy):
    
    def sort(self, data: List[int]) -> List[int]:
        arr = data.copy()
        
        def _quick_sort(arr: List[int], low: int, high: int) -> List[int]:
            if low < high:
                pi = _partition(arr, low, high)
                _quick_sort(arr, low, pi-1)
                _quick_sort(arr, pi+1, high)
            return arr
        
        def _partition(arr: List[int], low: int, high: int) -> int:
            pivot = arr[high]
            i = low - 1
            for j in range(low, high):
                if arr[j] < pivot:
                    i += 1
                    arr[i], arr[j] = arr[j], arr[i]
            arr[i+1], arr[high] = arr[high], arr[i+1]
            return i + 1
        
        return _quick_sort(arr, 0, len(arr) - 1)

class InsertionSort(SortingStrategy):
    
    def sort(self, data: List[int]) -> List[int]:
        arr = data.copy()
        for i in range(1, len(arr)):
            key = arr[i]
            j = i - 1
            while j >= 0 and key < arr[j]:
                arr[j + 1] = arr[j]
                j -= 1
            arr[j + 1] = key
        return arr

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

def main():
    context = SortingContext()
    
    input_data = input("Introduce una lista de números (ejemplo: 2,43,55,100): ")
    
    try:
        data = [int(x) for x in input_data.split(',')]
    except ValueError:
        print("Por favor, ingresa solo números separados por comas.")
        return
    
    sorted_data = context.sort_data(data)
    print("Lista ordenada:", sorted_data)

if __name__ == "__main__":
    main()
