import tkinter as tk
from tkinter import messagebox

class MainWindow:
    def __init__(self, root, register_callback):
        self.root = root
        self.register_callback = register_callback
        self.create_widgets()

    def create_widgets(self):
        self.root.title("Productos")

        tk.Label(self.root, text="Nombre:").grid(row=0, column=0)
        self.name_entry = tk.Entry(self.root)
        self.name_entry.grid(row=0, column=1)

        tk.Label(self.root, text="Direccion:").grid(row=1, column=0)
        self.address_entry = tk.Entry(self.root)
        self.address_entry.grid(row=1, column=1)

        tk.Label(self.root, text="Fecha Inauguracion:").grid(row=2, column=0)
        self.inauguration_date_entry = tk.Entry(self.root)
        self.inauguration_date_entry.grid(row=2, column=1)

        tk.Label(self.root, text="Edad:").grid(row=3, column=0)
        self.age_entry = tk.Entry(self.root)
        self.age_entry.grid(row=3, column=1)

        register_button = tk.Button(self.root, text="Register", command=self.register)
        register_button.grid(row=4, columnspan=2)

    def register(self):
        name = self.name_entry.get()
        address = self.address_entry.get()
        inauguration_date = self.inauguration_date_entry.get()
        age = self.age_entry.get()

        if not name or not address or not inauguration_date or not age:
            messagebox.showerror("Error", "Todos los campos son obligatorios")
            return

        try:
            age = int(age)
        except ValueError:
            messagebox.showerror("Error", "La edad debe ser un número")
            return

        data = {
            "Nombre": name,
            "Direccion": address,
            "Fecha Inauguracion": inauguration_date,
            "Edad": age
        }

        self.register_callback(data)
        messagebox.showinfo("Éxito", "Registro exitoso")
