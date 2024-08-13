from furniture_model.furniture import FurnitureModel
from furniture_view.furniture_system import FurnitureView

class FurnitureController:
    def __init__(self):
        self.model = FurnitureModel()
        self.view = FurnitureView()

        # Conectar el botón de agregar con la función de agregar mueble
        self.view.add_button.config(command=self.add_furniture)

    def add_furniture(self):
        # Obtener datos desde la vista
        id_ = self.view.id_entry.get()
        name = self.view.name_entry.get()
        value = self.view.value_entry.get()
        value_with_iva = self.view.value_iva_entry.get()

        # Validar los datos
        if id_ and name and value and value_with_iva:
            # Crear el documento de mueble
            furniture_data = {
                "id": id_,
                "name": name,
                "value": float(value),
                "value_with_iva": float(value_with_iva)
            }
            # Insertar en la base de datos usando el modelo
            self.model.add_furniture(furniture_data)

            # Limpiar los campos después de agregar
            self.view.id_entry.delete(0, tk.END)
            self.view.name_entry.delete(0, tk.END)
            self.view.value_entry.delete(0, tk.END)
            self.view.value_iva_entry.config(state='normal')
            self.view.value_iva_entry.delete(0, tk.END)
            self.view.value_iva_entry.config(state='readonly')

    def run(self):
        # Ejecutar la aplicación
        self.view.mainloop()

if __name__ == "__main__":
    app = FurnitureController()
    app.run()
