from model.sort_strategy import BubbleSort, InsertionSort, QuickSort, SortStrategy

class SortContext:
    def __init__(self):
        self.strategy = None

        ##uso de la estrategia
        
    def set_strategy(self, array_size):
        # Selecciona la estrategia en función del tamaño del arreglo
        if array_size >= 2 and array_size <= 5:
            self.strategy = BubbleSort()
        elif array_size > 5 and array_size <= 10:
            self.strategy = InsertionSort()
        elif array_size > 10:
            self.strategy = QuickSort()
        else:
            raise ValueError("El tamaño del arreglo no es válido, debe ser mayor a 1")

    def sort_array(self, array):
        # Verifica si hay una estrategia definida antes de ordenar
        if not self.strategy:
            raise ValueError("No se ha definido una estrategia de ordenamiento")
        return self.strategy.sort(array)

    def get_strategy_name(self):
        # Devuelve el nombre de la estrategia usada, si existe
        if isinstance(self.strategy, BubbleSort):
            return "BubbleSort"
        elif isinstance(self.strategy, InsertionSort):
            return "InsertionSort"
        elif isinstance(self.strategy, QuickSort):
            return "QuickSort"
        else:
            return "Desconocida"
