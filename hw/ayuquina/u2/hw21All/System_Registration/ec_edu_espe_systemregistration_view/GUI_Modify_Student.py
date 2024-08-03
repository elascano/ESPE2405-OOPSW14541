import tkinter as tk
from tkinter import ttk
from pymongo import MongoClient
import unittest

class Persona:
    def __init__(self, cedula, nombre, apellido, email, celular):
        self.cedula = cedula
        self.nombre = nombre
        self.apellido = apellido
        self.email = email
        self.celular = celular

    def get_full_name(self):
        return f"{self.nombre} {self.apellido}"

class Estudiante(Persona):
    def __init__(self, cedula, nombre, apellido, codigo_carrera, email, celular, tipo_matricula, calificacion, supletorio, nota_final):
        super().__init__(cedula, nombre, apellido, email, celular)
        self.codigo_carrera = codigo_carrera
        self.tipo_matricula = tipo_matricula
        self.calificacion = calificacion
        self.supletorio = supletorio
        self.nota_final = nota_final

    def is_supletorio_required(self):
        return self.calificacion < 14

    def calculate_nota_final(self):
        if self.supletorio:
            self.nota_final = (self.calificacion + self.supletorio) / 2
        else:
            self.nota_final = self.calificacion

class SistemaMatriculas(tk.Tk):
    def __init__(self):
        super().__init__()

        # Configuración de la ventana principal
        self.title("Sistema de matrículas")
        self.geometry("400x600")  # Ajuste del tamaño de la ventana para acomodar todos los campos

        # Crear y colocar widgets
        self.create_widgets()

    def create_widgets(self):
        # Crear un frame principal
        main_frame = ttk.Frame(self)
        main_frame.pack(fill=tk.BOTH, expand=True, padx=10, pady=10)

        # Crear un frame para los campos de entrada
        input_frame = ttk.Frame(main_frame)
        input_frame.pack(fill=tk.BOTH, expand=True, padx=10, pady=10)

        # Campos de entrada y selección
        self.cedula_entry = self.add_entry(input_frame, "Cédula", 0)
        self.nombre_entry = self.add_entry(input_frame, "Nombre", 1)
        self.apellido_entry = self.add_entry(input_frame, "Apellido", 2)
        self.codigo_carrera_entry = self.add_entry(input_frame, "Código de carrera", 3)
        self.email_entry = self.add_entry(input_frame, "Email", 4)
        self.celular_entry = self.add_entry(input_frame, "Celular", 5)

        self.tipo_matricula_var = tk.StringVar()
        self.tipo_matricula_combobox = self.add_combobox(input_frame, "Tipo de matrícula", ["PRIMERA", "SEGUNDA", "TERCERA"], self.tipo_matricula_var, 6)

        self.calificacion_var = tk.DoubleVar()
        self.calificacion_entry = self.add_entry(input_frame, "Calificación", 7, variable=self.calificacion_var, is_number=True)

        self.supletorio_var = tk.DoubleVar()
        self.supletorio_entry = self.add_entry(input_frame, "Supletorio", 8, variable=self.supletorio_var, is_number=True, state="disabled")

        self.calificacion_var.trace_add("write", self.check_calificacion)

        self.nota_final_var = tk.StringVar()
        self.nota_final_label = ttk.Label(input_frame, text="Nota Final:")
        self.nota_final_label.grid(row=9, column=0, sticky=tk.E, padx=5, pady=5)
        self.nota_final_value_label = ttk.Label(input_frame, textvariable=self.nota_final_var)
        self.nota_final_value_label.grid(row=9, column=1, sticky=tk.W, padx=5, pady=5)

        # Botones para guardar y cancelar en la parte inferior
        button_frame = ttk.Frame(main_frame)
        button_frame.pack(side=tk.BOTTOM, fill=tk.X, padx=10, pady=10)

        save_button = ttk.Button(button_frame, text="Guardar", command=self.save_data)
        save_button.pack(side=tk.RIGHT, padx=5)

        cancel_button = ttk.Button(button_frame, text="Cancelar", command=self.cancel)
        cancel_button.pack(side=tk.RIGHT, padx=5)

    def add_entry(self, parent, label_text, row, variable=None, is_number=False, state="normal"):
        modify_var = tk.BooleanVar(value=False)

        label = ttk.Label(parent, text=f"{label_text}:")
        label.grid(row=row, column=0, sticky=tk.E, padx=5, pady=5)

        modify_checkbox = ttk.Checkbutton(parent, variable=modify_var, command=lambda: self.toggle_entry_state(entry, modify_var))
        modify_checkbox.grid(row=row, column=1, padx=5, pady=5, sticky=tk.E)

        entry_state = state if modify_var.get() else "disabled"
        if is_number:
            entry_var = variable if variable else tk.DoubleVar()
        else:
            entry_var = variable if variable else tk.StringVar()

        entry = ttk.Entry(parent, textvariable=entry_var, state=entry_state)
        entry.grid(row=row, column=2, padx=5, pady=5, sticky=tk.W)

        return entry

    def add_combobox(self, parent, label_text, values, variable, row):
        modify_var = tk.BooleanVar(value=False)

        label = ttk.Label(parent, text=f"{label_text}:")
        label.grid(row=row, column=0, sticky=tk.E, padx=5, pady=5)

        modify_checkbox = ttk.Checkbutton(parent, variable=modify_var, command=lambda: self.toggle_entry_state(combobox, modify_var))
        modify_checkbox.grid(row=row, column=1, padx=5, pady=5, sticky=tk.E)

        combobox = ttk.Combobox(parent, values=values, state="readonly", textvariable=variable)
        combobox.grid(row=row, column=2, padx=5, pady=5, sticky=tk.W)

        self.toggle_entry_state(combobox, modify_var)
        return combobox

    def toggle_entry_state(self, widget, modify_var):
        state = "normal" if modify_var.get() else "disabled"
        widget.config(state=state)

    def check_calificacion(self, *args):
        try:
            calificacion = self.calificacion_var.get()
            if calificacion < 14:
                self.supletorio_entry.config(state="normal")
            else:
                self.supletorio_entry.config(state="disabled")
                self.supletorio_entry.delete(0, tk.END)
        except tk.TclError:
            pass

    def save_data(self):
        # Obtener datos de los campos
        cedula = self.cedula_entry.get()
        nombre = self.nombre_entry.get()
        apellido = self.apellido_entry.get()
        codigo_carrera = self.codigo_carrera_entry.get()
        email = self.email_entry.get()
        celular = self.celular_entry.get()
        tipo_matricula = self.tipo_matricula_var.get()
        calificacion = self.calificacion_var.get()
        supletorio = self.supletorio_var.get()

        # Calcular la nota final
        if supletorio:
            nota_final = (calificacion + supletorio) / 2
        else:
            nota_final = calificacion
        self.nota_final_var.set(nota_final)

        # Crear una instancia de la clase Estudiante con los datos ingresados
        estudiante = Estudiante(
            cedula=cedula,
            nombre=nombre,
            apellido=apellido,
            codigo_carrera=codigo_carrera,
            email=email,
            celular=celular,
            tipo_matricula=tipo_matricula,
            calificacion=calificacion,
            supletorio=supletorio,
            nota_final=nota_final
        )
        print("Datos del estudiante actualizados:", estudiante.__dict__)
        self.save_to_mongo(estudiante)

    def save_to_mongo(self, estudiante):
        # Conectar a la base de datos de MongoDB y guardar los datos
        client = MongoClient("mongodb+srv://ayuquina:ayuquina@cluster0.crwllgh.mongodb.net/")
        db = client['OOP']
        collection = db['Students']

        # Insertar los datos del estudiante en la colección
        collection.insert_one(estudiante.__dict__)

    def cancel(self):
        # Limpiar todos los campos
        self.cedula_entry.delete(0, tk.END)
        self.nombre_entry.delete(0, tk.END)
        self.apellido_entry.delete(0, tk.END)
        self.codigo_carrera_entry.delete(0, tk.END)
        self.email_entry.delete(0, tk.END)
        self.celular_entry.delete(0, tk.END)
        self.tipo_matricula_var.set("")
        self.calificacion_var.set(0)
        self.supletorio_var.set(0)
        self.supletorio_entry.config(state="disabled")
        self.nota_final_var.set("")

# Unidad de test cases
class TestSistemaMatriculas(unittest.TestCase):
    def test_estudiante(self):
        estudiante = Estudiante("17532698", "Danny", "Mateo", "14dfx", "danny@gmail.com", "226-201", "PRIMERA", 15, 0, 15)
        self.assertEqual(estudiante.get_full_name(), "Danny Mateo")
        self.assertFalse(estudiante.is_supletorio_required())
        self.assertEqual(estudiante.nota_final, 15)

        estudiante = Estudiante("175326985001", "Danny", "Mateo", "14543", "danny@hotmail.com", "0987326319", "segunda", 12, 16, 14)
        estudiante.calculate_nota_final()
        self.assertEqual(estudiante.nota_final, 14)

    def test_persona(self):
        persona = Persona("17532698", "Danny", "Mateo", "14dfx", "danny@gmail.com", "226-201")
        self.assertEqual(persona.get_full_name(), "Danny Mateo")

if __name__ == "__main__":
    # Ejecutar la aplicación
    app = SistemaMatriculas()
    app.mainloop()

    # Ejecutar los test cases
    unittest.main(exit=False)
