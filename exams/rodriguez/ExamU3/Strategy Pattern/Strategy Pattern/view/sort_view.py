import sys
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
import tkinter as tk
from tkinter import messagebox
from controller.sort_controller import SortController

class SortView:
    def __init__(self, root, controller):
        self.root = root
        self.controller = controller
        self.root.title("Sorting Application")

        self.label = tk.Label(root, text="Enter numbers separated by commas:")
        self.label.pack()

        self.entry = tk.Entry(root, width=50)
        self.entry.pack()

        self.sort_button = tk.Button(root, text="Sort", command=self.on_sort_button_click)
        self.sort_button.pack()

    def on_sort_button_click(self):
        data = self.entry.get()
        self.controller.handle_sort_request(data)

    def show_message(self, title, message):
        messagebox.showinfo(title, message)

if __name__ == "__main__":
    root = tk.Tk()
    view = SortView(root, None)
    controller = SortController(view)
    view.controller = controller  
    root.mainloop()
