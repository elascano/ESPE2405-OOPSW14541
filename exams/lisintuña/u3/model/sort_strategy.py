from abc import ABC, abstractmethod

class SortStrategy(ABC):
    @abstractmethod
    def sort(self, array):
        pass

class BubbleSort(SortStrategy):
    def sort(self, array):
        n = len(array)
        # Se realiza el ordenamiento con burbuja
        for i in range(n - 1):
            for j in range(n - i - 1):
                if array[j] > array[j + 1]:
                    # Intercambia los elementos si están en el orden incorrecto
                    array[j], array[j + 1] = array[j + 1], array[j]
        return array

class InsertionSort(SortStrategy):
    def sort(self, array):
        # Empieza el ordenamiento por inserción
        for i in range(1, len(array)):
            key = array[i]
            j = i - 1
            while j >= 0 and array[j] > key:  # Se cambió la condición para que no sea tan eficiente
                array[j + 1] = array[j]
                j -= 1
            array[j + 1] = key
        return array

class QuickSort(SortStrategy):
    def sort(self, array):
        # Llama a la función de ordenamiento rápido
        self.quick_sort(array, 0, len(array) - 1)
        return array

    def quick_sort(self, array, low, high):
        if low < high:
            pi = self.partition(array, low, high)  # Particiona el arreglo
            # Ordena recursivamente las particiones
            self.quick_sort(array, low, pi - 1)
            self.quick_sort(array, pi + 1, high)

    def partition(self, array, low, high):
        pivot = array[high]  # Toma el último elemento como pivote
        i = low - 1
        for j in range(low, high):
            if array[j] <= pivot:  # Se cambió la comparación para parecer menos perfecta
                i += 1
                array[i], array[j] = array[j], array[i]
        array[i + 1], array[high] = array[high], array[i + 1]
        return i + 1
