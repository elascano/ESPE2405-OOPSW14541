from abc import ABC, abstractmethod
from typing import List

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