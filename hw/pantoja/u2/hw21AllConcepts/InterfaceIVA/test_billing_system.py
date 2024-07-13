import unittest
from tkinter import Tk
from tkinter.simpledialog import Dialog
from unittest.mock import patch
from io import StringIO
from pymongo import MongoClient
from InterfaceIVA import BillingSystemApp  # Asegúrate de importar correctamente tu clase

# Mock de la conexión a MongoDB para pruebas
class MockMongoClient:
    def __init__(self, *args, **kwargs):
        pass
    
    def __getitem__(self, key):
        return self
    
    def __getattr__(self, name):
        return lambda x: None  # Mock para collection.insert_one

class TestBillingSystemApp(unittest.TestCase):

    def setUp(self):
        # Configuración inicial para las pruebas
        self.root = Tk()
        self.app = BillingSystemApp(self.root)
        self.app.root.withdraw()  # Evita que aparezca la ventana principal durante las pruebas
        self.app.client = MockMongoClient()  # Sobrescribe la conexión a MongoDB con el mock

    def tearDown(self):
        # Limpiar después de cada prueba si es necesario
        self.root.destroy()

    def test_agregar_producto(self):
        # Simulación de entrada de usuario
        self.app.producto_id.set("1")
        self.app.cantidad.set("2")
        
        # Ejecutar la función agregar_producto()
        self.app.agregar_producto()
        
        # Verificar que se agregó el producto correctamente
        self.assertEqual(len(self.app.productos_seleccionados), 1)
        self.assertEqual(self.app.productos_seleccionados[0][0][0], "Hamburguesa 1/2")
        self.assertEqual(self.app.productos_seleccionados[0][1], 2)

    @patch('tkinter.messagebox.showinfo')  # Mock para el messagebox.showinfo
    def test_generar_factura(self, mock_showinfo):
        # Simulación de entrada de usuario
        self.app.tipo_documento.set("Cedula")
        self.app.documento.set("123456")
        self.app.nombre.set("Juan Pérez")
        self.app.email.set("juan@example.com")
        self.app.metodo_pago.set("Efectivo")
        self.app.productos_seleccionados = [(("Hamburguesa 1/2", 5.99), 2)]

        # Redirigir la salida para capturarla y verificarla
        output = StringIO()
        self.app.factura_text = output

        # Ejecutar la función generar_factura()
        self.app.generar_factura()

        # Verificar la salida esperada en el texto de la factura
        output_str = output.getvalue()
        self.assertIn("Juan Pérez", output_str)
        self.assertIn("Efectivo", output_str)
        self.assertIn("Hamburguesa 1/2", output_str)

        # Verificar que se mostró el messagebox.showinfo con el mensaje correcto
        mock_showinfo.assert_called_once_with("Factura Generada", "La factura ha sido generada y guardada en la base de datos correctamente")

if __name__ == "__main__":
    unittest.main()




