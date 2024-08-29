import tkinter as tk
from tkinter import messagebox
from controller.SortContext import SortContext
from pymongo import MongoClient

# MongoDB Connection
client = MongoClient("mongodb+srv://logiclegion:logiclegion123@cluster0.pkfbgix.mongodb.net/")
db = client["strategyLastName"]
collection = db["arrayFirstName"]

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