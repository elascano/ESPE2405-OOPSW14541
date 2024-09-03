# sort_context.py

from sort_strategy import BubbleSort, InsertionSort, QuickSort, SortStrategy

class SortContext:
    def __init__(self):
        self.strategy = None

    def set_strategy(self, array_size):
        if 2 <= array_size <= 5:
            self.strategy = BubbleSort()
        elif 6 <= array_size <= 10:
            self.strategy = InsertionSort()
        elif array_size > 10:
            self.strategy = QuickSort()
        else:
            raise ValueError("El tamaño del arreglo debe ser mayor a 1")

    def sort_array(self, array):
        if not self.strategy:
            raise ValueError("Estrategia de ordenamiento no definida")
        return self.strategy.sort(array)

    def get_strategy_name(self):
        if isinstance(self.strategy, BubbleSort):
            return "BubbleSort"
        elif isinstance(self.strategy, InsertionSort):
            return "InsertionSort"
        elif isinstance(self.strategy, QuickSort):
            return "QuickSort"
        return "Unknown"
