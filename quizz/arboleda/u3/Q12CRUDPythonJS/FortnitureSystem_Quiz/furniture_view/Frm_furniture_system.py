import tkinter as tk
from pymongo import MongoClient

class FurnitureApp(tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("Agregar Mueble")
        self.geometry("250x230")

        tk.Label(self, text="ID:").grid(row=0, column=0, padx=10, pady=10)
        self.id_entry = tk.Entry(self)
        self.id_entry.grid(row=0, column=1, padx=10, pady=10)

        tk.Label(self, text="Name:").grid(row=1, column=0, padx=10, pady=10)
        self.name_entry = tk.Entry(self)
        self.name_entry.grid(row=1, column=1, padx=10, pady=10)

        tk.Label(self, text="Value:").grid(row=2, column=0, padx=10, pady=10)
        self.value_entry = tk.Entry(self)
        self.value_entry.grid(row=2, column=1, padx=10, pady=10)

        tk.Label(self, text="Value with IVA:").grid(row=3, column=0, padx=10, pady=10)
        self.value_iva_entry = tk.Entry(self, state='readonly')
        self.value_iva_entry.grid(row=3, column=1, padx=10, pady=10)

        self.add_button = tk.Button(self, text="Add", command=self.add_furniture)
        self.add_button.grid(row=4, column=0, padx=10, pady=10)

        self.cancel_button = tk.Button(self, text="Cancel", command=self.quit)
        self.cancel_button.grid(row=4, column=1, padx=10, pady=10)

        self.client = MongoClient("mongodb+srv://logiclegion:logiclegion123@cluster0.pkfbgix.mongodb.net/")
        self.db = self.client["WS36"]
        self.collection = self.db["Furniture"]

        self.value_entry.bind("<KeyRelease>", self.calculate_value_with_iva)

    def calculate_value_with_iva(self, event=None):
        try:
            value = float(self.value_entry.get())
            value_with_iva = value * 1.15  
            self.value_iva_entry.config(state='normal')
            self.value_iva_entry.delete(0, tk.END)
            self.value_iva_entry.insert(0, f"{value_with_iva:.2f}")
            self.value_iva_entry.config(state='readonly')
        except ValueError:
            self.value_iva_entry.config(state='normal')
            self.value_iva_entry.delete(0, tk.END)
            self.value_iva_entry.config(state='readonly')

    def add_furniture(self):
        id_ = self.id_entry.get()
        name = self.name_entry.get()
        value = self.value_entry.get()
        value_with_iva = self.value_iva_entry.get()

        if id_ and name and value and value_with_iva:
            furniture_data = {
                "id": id_,
                "name": name,
                "value": float(value),
                "value_with_iva": float(value_with_iva)
            }
            self.collection.insert_one(furniture_data)

            self.id_entry.delete(0, tk.END)
            self.name_entry.delete(0, tk.END)
            self.value_entry.delete(0, tk.END)
            self.value_iva_entry.config(state='normal')
            self.value_iva_entry.delete(0, tk.END)
            self.value_iva_entry.config(state='readonly')

if __name__ == "__main__":
    app = FurnitureApp()
    app.mainloop()
