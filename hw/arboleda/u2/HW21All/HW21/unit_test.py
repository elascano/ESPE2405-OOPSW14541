import sys
import os
import unittest

# Agrega el directorio principal del proyecto al path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from hw21 import Estudiante


class TestEstudiante(unittest.TestCase):
    def test_calcular_nota_final_sin_supletorio(self):
        estudiante = Estudiante(dni="12345678", nombre="Juan", apellido="Pérez", codigo_carrera="101", email="juan@example.com", telefono="123456789", tipo_matricula="Primera", nota_unidad1=16, nota_unidad2=18)
        self.assertEqual(estudiante.nota_final, 17)

    def test_calcular_nota_final_con_supletorio(self):
        estudiante = Estudiante(dni="12345678", nombre="Juan", apellido="Pérez", codigo_carrera="101", email="juan@example.com", telefono="123456789", tipo_matricula="Primera", nota_unidad1=12, nota_unidad2=15, nota_supletorio=5)
        self.assertEqual(estudiante.nota_final, 20)

    def test_calcular_nota_final_con_supletorio_ambas_menores_a_14(self):
        estudiante = Estudiante(dni="12345678", nombre="Juan", apellido="Pérez", codigo_carrera="101", email="juan@example.com", telefono="123456789", tipo_matricula="Primera", nota_unidad1=10, nota_unidad2=13, nota_supletorio=6)
        self.assertEqual(estudiante.nota_final, 19)

    def test_calcular_gratuidad_si(self):
        estudiante = Estudiante(dni="12345678", nombre="Juan", apellido="Pérez", codigo_carrera="101", email="juan@example.com", telefono="123456789", tipo_matricula="Primera", nota_unidad1=16, nota_unidad2=18)
        self.assertEqual(estudiante.gratuidad, 'Sí')

    def test_calcular_gratuidad_no_por_tipo_matricula(self):
        estudiante = Estudiante(dni="12345678", nombre="Juan", apellido="Pérez", codigo_carrera="101", email="juan@example.com", telefono="123456789", tipo_matricula="Segunda", nota_unidad1=16, nota_unidad2=18)
        self.assertEqual(estudiante.gratuidad, 'No')

    def test_calcular_gratuidad_no_por_nota_final(self):
        estudiante = Estudiante(dni="12345678", nombre="Juan", apellido="Pérez", codigo_carrera="101", email="juan@example.com", telefono="123456789", tipo_matricula="Primera", nota_unidad1=10, nota_unidad2=12)
        self.assertEqual(estudiante.gratuidad, 'No')

if __name__ == "__main__":
    unittest.main()

