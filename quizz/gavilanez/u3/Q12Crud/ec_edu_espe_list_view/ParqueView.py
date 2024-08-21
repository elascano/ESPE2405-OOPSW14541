import sys
sys.path.append(r'C:/KennyPOO/ESPE2405-OOPSW14541/quizz/gavilanez/u3/Q12Crud')

import tkinter as tk
from tkinter import ttk, messagebox
from ec_edu_espe_list_controller.ParqueController import ParqueController

class ParqueView: 
    def __init__(self, root):
        self.controller = ParqueController()

        root.title("Consultar Parques")

        # Etiqueta y entrada para el nombre
        tk.Label(root, text="Nombre:").grid(row=0, column=0)
        self.entry_nombre = tk.Entry(root)
        self.entry_nombre.grid(row=0, column=1)

        # Botón de búsqueda
        self.boton_buscar = tk.Button(root, text="Buscar", command=self.buscar_parques)
        self.boton_buscar.grid(row=0, column=2)

        # Tabla para mostrar los resultados
        columnas = ("Nombre", "Dirección", "Fecha", "Edad")
        self.tabla = ttk.Treeview(root, columns=columnas, show="headings")
        for col in columnas:
            self.tabla.heading(col, text=col)
        self.tabla.grid(row=1, column=0, columnspan=3)

    def buscar_parques(self):
        # Limpiar tabla
        for i in self.tabla.get_children():
            self.tabla.delete(i)

        # Obtener nombre ingresado
        nombre = self.entry_nombre.get()

        # Validar si se ingresó un nombre
        if not nombre:
            messagebox.showwarning("Advertencia", "Por favor ingrese un nombre para buscar.")
            return

        # Consultar parques usando el controlador
        try:
            parques = self.controller.buscar_parques(nombre)
            if not parques:
                messagebox.showinfo("Resultado", "No se encontraron parques con ese nombre.")
                return

            # Mostrar los resultados en la tabla
            for parque in parques:
                # Obtener valores desde MongoDB
                nombre_parque = parque.get("Nombre", "N/A")
                direccion = parque.get("Direccion", "N/A")
                fecha = parque.get("Fecha Inauguracion", "N/A")  # Asegúrate que esté en formato legible
                edad = parque.get("Edad", "N/A")
                self.tabla.insert("", "end", values=(nombre_parque, direccion, fecha, edad))
        
        except Exception as e:
            messagebox.showerror("Error", f"Ocurrió un error al buscar parques: {str(e)}")

if __name__ == "__main__":
    root = tk.Tk()
    app = ParqueView(root)
    root.mainloop()
