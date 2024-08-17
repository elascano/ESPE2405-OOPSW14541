import tkinter as tk

class FurnitureView(tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("Agregar Mueble")
        self.geometry("300x250")

        # Campos de entrada
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

        # Botones
        self.add_button = tk.Button(self, text="Add")
        self.add_button.grid(row=4, column=0, padx=10, pady=10)

        self.cancel_button = tk.Button(self, text="Cancel", command=self.quit)
        self.cancel_button.grid(row=4, column=1, padx=10, pady=10)

        # Vincular el campo de valor para calcular automáticamente el valor con IVA
        self.value_entry.bind("<KeyRelease>", self.calculate_value_with_iva)

    def calculate_value_with_iva(self, event=None):
        try:
            value = float(self.value_entry.get())
            value_with_iva = value * 1.21  # Suponiendo un IVA del 21%
            self.value_iva_entry.config(state='normal')
            self.value_iva_entry.delete(0, tk.END)
            self.value_iva_entry.insert(0, f"{value_with_iva:.2f}")
            self.value_iva_entry.config(state='readonly')
        except ValueError:
            # Si no se puede convertir el valor a float, dejar el campo de IVA vacío
            self.value_iva_entry.config(state='normal')
            self.value_iva_entry.delete(0, tk.END)
            self.value_iva_entry.config(state='readonly')
