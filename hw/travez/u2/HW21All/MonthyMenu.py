import tkinter as tk
from tkinter import ttk
import json
from pymongo import MongoClient

class App:
    def __init__(self, root):
        self.root = root
        self.root.title("Change menu")
        
        self.client = MongoClient("mongodb+srv://ismael:ismael@cluster0.tayl6re.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
        self.db = self.client["oop"]
        self.collection = self.db["monthlymenu"]

        self.menu_data = self.load_menu_data()
        
        
        self.label = tk.Label(root, text="Select month:")
        self.label.grid(row=0, column=0, padx=10, pady=10)
        
        self.selected_month = tk.StringVar()
        self.combobox = ttk.Combobox(root, textvariable=self.selected_month, state='readonly')
        self.combobox['values'] = [str(i) for i in range(1, 13)]  # Values from 1 to 12
        self.combobox.grid(row=0, column=1, padx=10, pady=10)
        self.combobox.bind("<<ComboboxSelected>>", self.update_menu_info)
        
        self.breakfast_label = tk.Label(root, text="Breakfast:")
        self.breakfast_label.grid(row=1, column=0, padx=10, pady=5, sticky='E')
        self.breakfast_entry = tk.Entry(root)
        self.breakfast_entry.grid(row=1, column=1, padx=10, pady=5, sticky='W')
        
        self.lunch_label = tk.Label(root, text="Lunch:")
        self.lunch_label.grid(row=2, column=0, padx=10, pady=5, sticky='E')
        self.lunch_entry = tk.Entry(root)
        self.lunch_entry.grid(row=2, column=1, padx=10, pady=5, sticky='W')
        
        self.dinner_label = tk.Label(root, text="Dinner:")
        self.dinner_label.grid(row=3, column=0, padx=10, pady=5, sticky='E')
        self.dinner_entry = tk.Entry(root)
        self.dinner_entry.grid(row=3, column=1, padx=10, pady=5, sticky='W')
        
        self.cancel_button = tk.Button(root, text="Cancel", command=root.quit)
        self.cancel_button.grid(row=4, column=0, padx=10, pady=10)
        
        self.apply_button = tk.Button(root, text="Apply", command=self.apply_changes)
        self.apply_button.grid(row=4, column=1, padx=10, pady=10)
    
    def load_menu_data(self):
        menu_data = {}
        cursor = self.collection.find({})
        for document in cursor:
            menu_data[str(document['month'])] = {
                "breakfast": document.get("breakfast", ""),
                "lunch": document.get("lunch", ""),
                "dinner": document.get("dinner", "")
            }
        return menu_data

    def update_menu_info(self, event):
        month = self.selected_month.get()
        menu_info = self.menu_data.get(month, {})
        
        self.breakfast_entry.delete(0, tk.END)
        self.breakfast_entry.insert(0, menu_info.get("breakfast", ""))
        
        self.lunch_entry.delete(0, tk.END)
        self.lunch_entry.insert(0, menu_info.get("lunch", ""))
        
        self.dinner_entry.delete(0, tk.END)
        self.dinner_entry.insert(0, menu_info.get("dinner", ""))
    
    def apply_changes(self):
        month = self.selected_month.get()
        menu_info = {
            "breakfast": self.breakfast_entry.get(),
            "lunch": self.lunch_entry.get(),
            "dinner": self.dinner_entry.get()
        }
        
        self.collection.update_one(
            {"month": int(month)},
            {"$set": menu_info},
            upsert=True
        )
        
        self.menu_data[month] = menu_info
        print(json.dumps(menu_info, indent=4))

if __name__ == "__main__":
    root = tk.Tk()
    app = App(root)
    root.mainloop()