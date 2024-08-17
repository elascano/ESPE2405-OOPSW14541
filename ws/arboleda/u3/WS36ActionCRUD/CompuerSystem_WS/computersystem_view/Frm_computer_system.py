import tkinter as tk
from tkinter import ttk
from pymongo import MongoClient

class ComputerModel:
    def __init__(self):
        self.client = MongoClient("mongodb+srv://logiclegion:logiclegion123@cluster0.pkfbgix.mongodb.net/")
        self.db = self.client["WS36"] 
        self.collection = self.db["Computers"]

    def fetch_computers(self):
        computers = list(self.collection.find({}, {"id": 1, "speed": 1, "memory_size": 1}))
        
        for computer in computers:
            computer["speed"] = float(computer.get("speed", 0))
            computer["memory_size"] = int(computer.get("memory_size", 0))
        
        return computers

class ComputerView(tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("Lista de Computadoras")
        self.geometry("800x400")

        self.tree = ttk.Treeview(self, columns=("ID", "Speed", "Memory Size", "Performance"), show="headings")
        self.tree.heading("ID", text="ID")
        self.tree.heading("Speed", text="Velocidad de Procesamiento")
        self.tree.heading("Memory Size", text="Tamaño de Memoria")
        self.tree.heading("Performance", text="Rendimiento")
        self.tree.pack(fill=tk.BOTH, expand=True)

        self.load_button = tk.Button(self, text="Cargar Lista")
        self.load_button.pack(side=tk.LEFT, padx=10, pady=10)

        self.back_button = tk.Button(self, text="Volver", command=self.quit)
        self.back_button.pack(side=tk.RIGHT, padx=10, pady=10)

    def insert_data(self, data):
        self.tree.delete(*self.tree.get_children())
        for item in data:
            performance = item["speed"] * item["memory_size"]
            self.tree.insert("", tk.END, values=(item["id"], item["speed"], item["memory_size"], performance))

class ComputerController:
    def __init__(self):
        self.model = ComputerModel()
        self.view = ComputerView()

        self.view.load_button.config(command=self.load_computer_data)

    def load_computer_data(self):
        computers = self.model.fetch_computers()
        self.view.insert_data(computers)

    def run(self):
        self.view.mainloop()

if __name__ == "__main__":
    app = ComputerController()
    app.run()
