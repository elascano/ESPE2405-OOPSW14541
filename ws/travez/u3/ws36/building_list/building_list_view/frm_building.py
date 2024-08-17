
import sys
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
import tkinter as tk
from tkinter import ttk
from building_list_model.building import Building
from building_list_controller.building_controller import building_controller

class BuildingTable(tk.Tk):
    def __init__(self, buildings):
        super().__init__()
        self.title("Building Table")
        self.buildings = buildings  
        self.create_widgets()

    def create_widgets(self):
        frame = ttk.Frame(self)
        frame.pack(fill='both', expand=True)

        self.tree = ttk.Treeview(frame, columns=("ID", "Name", "Year", "Age"), show="headings")
        self.tree.heading("ID", text="ID")
        self.tree.heading("Name", text="Name")
        self.tree.heading("Year", text="Year")
        self.tree.heading("Age", text="Age")
        
        self.tree.pack(fill='both', expand=True)

        refresh_button = tk.Button(self, text="Refresh", command=self.refresh_table)
        refresh_button.pack(pady=10)

        self.refresh_table()

    def refresh_table(self):
        for item in self.tree.get_children():
            self.tree.delete(item)

        for building in self.buildings:
            self.tree.insert("", tk.END, values=(building.id, building.name, building.year, building_controller.calculate_age(building.year)))

buildings = [
    Building(1, "G200", 2000),
    Building(2, "Administrative", 2004),
    Building(3, "Rooms", 1995),
]

if __name__ == "__main__":
    app = BuildingTable(buildings)
    app.mainloop()
