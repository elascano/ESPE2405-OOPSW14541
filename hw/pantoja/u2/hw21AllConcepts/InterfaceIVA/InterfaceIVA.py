import tkinter as tk
from tkinter import messagebox
from pymongo import MongoClient
import re

# Configuración de MongoDB
client = MongoClient("mongodb+srv://cdpantoja2:pantoja@cluster0.uqhoeh0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
db = client["OOP"]
collection = db["InterfaceIVA"]

# Configuración de la tasa de IVA
IVA_RATE = 0.15

class BillingSystemApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Billing System")

        # Variables
        self.tipo_documento = tk.StringVar(value="Cedula")
        self.documento = tk.StringVar()
        self.nombre = tk.StringVar()
        self.email = tk.StringVar()
        self.metodo_pago = tk.StringVar(value="Efectivo")
        self.producto_id = tk.StringVar()
        self.cantidad = tk.StringVar()
        self.productos_seleccionados = []

        # Creación de widgets
        self.create_widgets()

    def create_widgets(self):
        # Tipo de documento
        tk.Label(self.root, text="Tipo de Documento:").grid(row=0, column=0)
        tk.OptionMenu(self.root, self.tipo_documento, "Cedula", "RUC").grid(row=0, column=1)

        # Número de documento
        tk.Label(self.root, text="Número de Documento:").grid(row=1, column=0)
        tk.Entry(self.root, textvariable=self.documento).grid(row=1, column=1)

        # Nombre del cliente
        tk.Label(self.root, text="Nombre del Cliente:").grid(row=2, column=0)
        tk.Entry(self.root, textvariable=self.nombre).grid(row=2, column=1)

        # Email del cliente
        tk.Label(self.root, text="Email del Cliente:").grid(row=3, column=0)
        tk.Entry(self.root, textvariable=self.email).grid(row=3, column=1)

        # Método de pago
        tk.Label(self.root, text="Método de Pago:").grid(row=4, column=0)
        tk.OptionMenu(self.root, self.metodo_pago, "Efectivo", "Tarjeta de Crédito", "Pago Móvil").grid(row=4, column=1)

        # ID del producto
        tk.Label(self.root, text="ID del Producto:").grid(row=5, column=0)
        tk.Entry(self.root, textvariable=self.producto_id).grid(row=5, column=1)

        # Cantidad del producto
        tk.Label(self.root, text="Cantidad:").grid(row=6, column=0)
        tk.Entry(self.root, textvariable=self.cantidad).grid(row=6, column=1)

        # Botón para agregar producto
        tk.Button(self.root, text="Agregar Producto", command=self.agregar_producto).grid(row=7, column=0, columnspan=2)

        # Botón para generar factura
        tk.Button(self.root, text="Generar Factura", command=self.generar_factura).grid(row=8, column=0, columnspan=2)

        # Area para mostrar factura
        self.factura_text = tk.Text(self.root, height=10, width=50)
        self.factura_text.grid(row=9, column=0, columnspan=2)

    def agregar_producto(self):
        try:
            producto_id = int(self.producto_id.get())
            cantidad = int(self.cantidad.get())
            if cantidad <= 0:
                raise ValueError("Cantidad debe ser mayor a 0")
            # Aquí puedes añadir lógica para obtener el precio del producto basado en el ID
            # Por simplicidad, usaremos un diccionario de ejemplo
            productos = {
                1: ("Hamburguesa 1/2", 5.99),
                2: ("Porción de papas", 2.99),
                3: ("Gaseosa litro", 2.00),
                # Añade más productos según sea necesario
            }
            if producto_id not in productos:
                raise ValueError("ID de producto inválido")
            producto = productos[producto_id]
            self.productos_seleccionados.append((producto, cantidad))
            messagebox.showinfo("Producto Agregado", f"{producto[0]} x {cantidad} agregado correctamente")
        except ValueError as e:
            messagebox.showerror("Error", str(e))

    def generar_factura(self):
        try:
            # Validar entradas
            if not re.match(r"^\d+$", self.documento.get()):
                raise ValueError("Número de documento inválido")
            if not re.match(r"[^@]+@[^@]+\.[^@]+", self.email.get()):
                raise ValueError("Email inválido")

            subtotal = sum([producto[1] * cantidad for producto, cantidad in self.productos_seleccionados])
            iva = subtotal * IVA_RATE
            total = subtotal + iva

            # Generar factura en formato de texto
            factura = f"""
            ------------------------------------------
            | Factura creada                          |
            ------------------------------------------
            | Tipo de ID: {self.tipo_documento.get()} ({self.documento.get()})           |
            | Cliente: {self.nombre.get()}                         |
            | Método de pago: {self.metodo_pago.get()}                |
            ------------------------------------------
            | Productos:                               |
            """
            for producto, cantidad in self.productos_seleccionados:
                factura += f"| {producto[0]}            {cantidad} x ${producto[1]}   |\n"
            factura += f"""
            ------------------------------------------
            | Subtotal: ${subtotal:.2f}                         |
            | IVA: ${iva:.2f}                              |
            | Total: ${total:.2f}                            |
            """

            self.factura_text.delete(1.0, tk.END)
            self.factura_text.insert(tk.END, factura)

            # Guardar factura en MongoDB
            factura_data = {
                "tipo_documento": self.tipo_documento.get(),
                "documento": self.documento.get(),
                "nombre": self.nombre.get(),
                "email": self.email.get(),
                "metodo_pago": self.metodo_pago.get(),
                "productos": [{"nombre": producto[0], "precio": producto[1], "cantidad": cantidad} for producto, cantidad in self.productos_seleccionados],
                "subtotal": subtotal,
                "iva": iva,
                "total": total
            }
            collection.insert_one(factura_data)
            messagebox.showinfo("Factura Generada", "La factura ha sido generada y guardada en la base de datos correctamente")

        except ValueError as e:
            messagebox.showerror("Error", str(e))
        except Exception as e:
            messagebox.showerror("Error", f"Ha ocurrido un error: {e}")

if __name__ == "__main__":
    root = tk.Tk()
    app = BillingSystemApp(root)
    root.mainloop()


