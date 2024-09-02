
from model.sorting_strategy import SortingStrategy
from model.database import Database
from model.bubble_sort import BubbleSort
from model.insertion_sort import InsertionSort
from model.quick_sort import QuickSort
from model.database import Database

class SortController:
    def __init__(self, view):
        self.view = view
        
        self.database = Database("mongodb+srv://rodriguez:rodriguez@cluster0.0otfs2m.mongodb.net/", "strategyRodriguez", "arrayDavid")

    def handle_sort_request(self, data):
        data = list(map(int, data.split(',')))
        original_data = data.copy()

        if len(data) < 2:
            self.view.show_message("Error", "Array must have more than one element")
            return

        if 2 <= len(data) <= 5:
            sort_strategy = BubbleSort()
            algorithm = "BubbleSort"
        elif 6 <= len(data) <= 10:
            sort_strategy = InsertionSort()
            algorithm = "InsertionSort"
        else:
            sort_strategy = QuickSort()
            algorithm = "QuickSort"

        sorted_data = sort_strategy.sort(data)
        self.view.show_message("Sorted Data", f"Original: {original_data}\nSorted: {sorted_data}\nAlgorithm: {algorithm}")

        self.database.save_sort_result(original_data, len(original_data), algorithm, sorted_data)
