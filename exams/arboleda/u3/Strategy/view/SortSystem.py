from abc import ABC, abstractmethod
import tkinter as tk
from tkinter import messagebox
from pymongo import MongoClient

# Strategy Interface
class SortStrategy(ABC):
    @abstractmethod
    def sort(self, data):
        pass

# Concrete Strategy: Bubble Sort
class BubbleSort(SortStrategy):
    def sort(self, data):
        n = len(data)
        for i in range(n):
            for j in range(0, n - i - 1):
                if data[j] > data[j + 1]:
                    data[j], data[j + 1] = data[j + 1], data[j]
        return data

# Concrete Strategy: Insertion Sort
class InsertionSort(SortStrategy):
    def sort(self, data):
        for i in range(1, len(data)):
            key = data[i]
            j = i - 1
            while j >= 0 and key < data[j]:
                data[j + 1] = data[j]
                j -= 1
            data[j + 1] = key
        return data

# Concrete Strategy: Quick Sort
class QuickSort(SortStrategy):
    def sort(self, data):
        if len(data) <= 1:
            return data
        pivot = data[len(data) // 2]
        left = [x for x in data if x < pivot]
        middle = [x for x in data if x == pivot]
        right = [x for x in data if x > pivot]
        return self.sort(left) + middle + self.sort(right)

# Context Class
class SortContext:
    def __init__(self, data):
        self.data = data
        self.strategy = self.choose_strategy()

    def choose_strategy(self):
        size = len(self.data)
        if 2 <= size <= 5:
            return BubbleSort()
        elif 6 <= size <= 10:
            return InsertionSort()
        elif size > 11:
            return QuickSort()
        else:
            raise ValueError("Array must have more than 1 element.")

    def sort(self):
        return self.strategy.sort(self.data)

# MongoDB Connection
client = MongoClient("mongodb+srv://logiclegion:logiclegion123@cluster0.pkfbgix.mongodb.net/")
db = client["strategyArboleda"]
collection = db["arrayAbnerArboleda"]

# Tkinter GUI setup
def on_sort_button_click():
    input_data = entry.get()
    data = list(map(int, input_data.split(',')))

    context = SortContext(data.copy())
    sorted_data = context.sort()

    unsorted_str = ','.join(map(str, data))
    sorted_str = ','.join(map(str, sorted_data))

    # Save to MongoDB
    collection.insert_one({
        "unsorted": unsorted_str,
        "size": len(data),
        "sort algorithm": context.strategy.__class__.__name__,
        "sorted": sorted_str
    })

    # Show messagebox
    messagebox.showinfo("Sort Result", f"Unsorted: {unsorted_str}\n"
                                       f"Size: {len(data)}\n"
                                       f"Algorithm: {context.strategy.__class__.__name__}\n"
                                       f"Sorted: {sorted_str}")

root = tk.Tk()
root.title("Strategy Pattern Sorting")

label = tk.Label(root, text="Enter numbers separated by commas:")
label.pack()

entry = tk.Entry(root, width=50)
entry.pack()

sort_button = tk.Button(root, text="Sort", command=on_sort_button_click)
sort_button.pack()

root.mainloop()
