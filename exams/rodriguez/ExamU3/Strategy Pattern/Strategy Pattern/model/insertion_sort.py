from model.sorting_strategy import SortingStrategy

class InsertionSort(SortingStrategy):
    def __init__(self):
        print("Creating InsertionSort strategy")

    def sort(self, data):
        for i in range(1, len(data)):
            key = data[i]
            j = i-1
            while j >= 0 and key < data[j]:
                data[j+1] = data[j]
                j -= 1
            data[j+1] = key
        return data