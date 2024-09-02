from model.sorting_strategy import SortingStrategy

class BubbleSort(SortingStrategy):
    def __init__(self):
        print("Creating BubbleSort strategy")

    def sort(self, data):
        n = len(data)
        for i in range(n):
            for j in range(0, n-i-1):
                if data[j] > data[j+1]:
                    data[j], data[j+1] = data[j+1], data[j]
        return data