
from ec_edu_espe_list_model.Parque import Parque

class ParqueController:
    def __init__(self):
        self.model = Parque()

    def buscar_parques(self, nombre=None):
        # Llamamos al método en el modelo para obtener los parques
        return self.model.obtener_parques(nombre)
