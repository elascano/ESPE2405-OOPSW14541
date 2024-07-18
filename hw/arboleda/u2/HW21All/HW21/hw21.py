import tkinter as tk
from tkinter import messagebox, ttk
from pymongo import MongoClient
import certifi

class Estudiante:
    def __init__(self, dni, nombre, apellido, codigo_carrera, email, telefono, tipo_matricula, nota_unidad1, nota_unidad2, nota_supletorio=None):
        self.dni = dni
        self.nombre = nombre
        self.apellido = apellido
        self.codigo_carrera = codigo_carrera
        self.email = email
        self.telefono = telefono
        self.tipo_matricula = tipo_matricula
        self.nota_unidad1 = nota_unidad1
        self.nota_unidad2 = nota_unidad2
        self.nota_supletorio = nota_supletorio
        self.nota_final = self.calcular_nota_final()
        self.gratuidad = self.calcular_gratuidad()

    def calcular_nota_final(self):
        if self.nota_supletorio is not None and (self.nota_unidad1 < 14 or self.nota_unidad2 < 14):
            return max(self.nota_unidad1, self.nota_unidad2) + self.nota_supletorio
        return (self.nota_unidad1 + self.nota_unidad2) / 2

    def calcular_gratuidad(self):
        return 'Sí' if self.tipo_matricula == 'Primera' and self.nota_final > 14 else 'No'

def agregar_estudiante():
    try:
        # Conectar a MongoDB
        client = MongoClient(
            "mongodb+srv://adarboleda:adarboleda@cluster0.es09omc.mongodb.net/hw21_bd",
            tls=True,
            tlsCAFile=certifi.where(),
            tlsAllowInvalidCertificates=False  # Asegúrate de que los certificados sean válidos
        )
        db = client['hw21_bd']
        collection = db['estudiantes']
        
        # Crear objeto Estudiante
        estudiante = Estudiante(
            dni=dni_entry.get(),
            nombre=nombre_entry.get(),
            apellido=apellido_entry.get(),
            codigo_carrera=codigo_carrera_entry.get(),
            email=email_entry.get(),
            telefono=telefono_entry.get(),
            tipo_matricula=tipo_matricula_combobox.get(),
            nota_unidad1=float(nota_unidad1_entry.get()),
            nota_unidad2=float(nota_unidad2_entry.get()),
            nota_supletorio=float(nota_supletorio_entry.get()) if nota_supletorio_entry.get() else None
        )
        
        # Insertar estudiante en la base de datos
        collection.insert_one(estudiante.__dict__)
        
        messagebox.showinfo("Éxito", "Estudiante agregado exitosamente")
    except Exception as e:
        messagebox.showerror("Error", str(e))

# Crear GUI
root = tk.Tk()
root.title("Agregar Estudiante")
root.geometry("300x450")  # Ajusta el tamaño de la ventana

tk.Label(root, text="Dni:").grid(row=0, column=0, padx=10, pady=5)
dni_entry = tk.Entry(root)
dni_entry.grid(row=0, column=1, padx=10, pady=5)

tk.Label(root, text="Nombre:").grid(row=1, column=0, padx=10, pady=5)
nombre_entry = tk.Entry(root)
nombre_entry.grid(row=1, column=1, padx=10, pady=5)

tk.Label(root, text="Apellido:").grid(row=2, column=0, padx=10, pady=5)
apellido_entry = tk.Entry(root)
apellido_entry.grid(row=2, column=1, padx=10, pady=5)

tk.Label(root, text="Código de Carrera:").grid(row=3, column=0, padx=10, pady=5)
codigo_carrera_entry = tk.Entry(root)
codigo_carrera_entry.grid(row=3, column=1, padx=10, pady=5)

tk.Label(root, text="Email:").grid(row=4, column=0, padx=10, pady=5)
email_entry = tk.Entry(root)
email_entry.grid(row=4, column=1, padx=10, pady=5)

tk.Label(root, text="Teléfono:").grid(row=5, column=0, padx=10, pady=5)
telefono_entry = tk.Entry(root)
telefono_entry.grid(row=5, column=1, padx=10, pady=5)

tk.Label(root, text="Tipo de Matrícula:").grid(row=6, column=0, padx=10, pady=5)
tipo_matricula_combobox = ttk.Combobox(root, values=["Primera", "Segunda", "Tercera"])
tipo_matricula_combobox.grid(row=6, column=1, padx=10, pady=5)
tipo_matricula_combobox.current(0)

tk.Label(root, text="Nota unidad 1:").grid(row=7, column=0, padx=10, pady=5)
nota_unidad1_entry = tk.Entry(root)
nota_unidad1_entry.grid(row=7, column=1, padx=10, pady=5)

tk.Label(root, text="Nota unidad 2:").grid(row=8, column=0, padx=10, pady=5)
nota_unidad2_entry = tk.Entry(root)
nota_unidad2_entry.grid(row=8, column=1, padx=10, pady=5)

tk.Label(root, text="Nota supletorio:").grid(row=9, column=0, padx=10, pady=5)
nota_supletorio_entry = tk.Entry(root)
nota_supletorio_entry.grid(row=9, column=1, padx=10, pady=5)
nota_supletorio_entry.config(state='disabled')  # Deshabilitar por defecto

tk.Label(root, text="Nota Final:").grid(row=10, column=0, padx=10, pady=5)
nota_final_label = tk.Label(root, text="")
nota_final_label.grid(row=10, column=1, padx=10, pady=5)

tk.Label(root, text="Gratuidad:").grid(row=11, column=0, padx=10, pady=5)
gratuidad_label = tk.Label(root, text="")
gratuidad_label.grid(row=11, column=1, padx=10, pady=5)

def actualizar_nota_final_y_gratuidad(*args):
    try:
        nota_unidad1 = float(nota_unidad1_entry.get())
        nota_unidad2 = float(nota_unidad2_entry.get())
        promedio = (nota_unidad1 + nota_unidad2) / 2
        
        if promedio < 14:
            nota_supletorio_entry.config(state='normal')
        else:
            nota_supletorio_entry.config(state='disabled')
            nota_supletorio_entry.delete(0, tk.END)

        nota_supletorio = float(nota_supletorio_entry.get()) if nota_supletorio_entry.get() else None

        estudiante = Estudiante(
            dni="", nombre="", apellido="", codigo_carrera="", email="", telefono="",
            tipo_matricula=tipo_matricula_combobox.get(),
            nota_unidad1=nota_unidad1, nota_unidad2=nota_unidad2, nota_supletorio=nota_supletorio
        )
        
        nota_final_label.config(text=estudiante.nota_final)
        gratuidad_label.config(text=estudiante.gratuidad)
    except ValueError:
        nota_final_label.config(text="")
        gratuidad_label.config(text="")

nota_unidad1_entry.bind("<KeyRelease>", actualizar_nota_final_y_gratuidad)
nota_unidad2_entry.bind("<KeyRelease>", actualizar_nota_final_y_gratuidad)
nota_supletorio_entry.bind("<KeyRelease>", actualizar_nota_final_y_gratuidad)
tipo_matricula_combobox.bind("<<ComboboxSelected>>", actualizar_nota_final_y_gratuidad)

tk.Button(root, text="Agregar Estudiante", command=agregar_estudiante).grid(row=12, column=0, columnspan=2, padx=10, pady=5)
tk.Button(root, text="Regresar", command=root.quit).grid(row=13, column=0, padx=10, pady=5)
tk.Button(root, text="Salir", command=root.quit).grid(row=13, column=1, padx=10, pady=5)

root.mainloop()
