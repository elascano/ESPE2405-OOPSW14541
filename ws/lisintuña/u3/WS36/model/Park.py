class Park:
    def __init__(self, nombres, direccion, edad):
        self.nombres = nombres
        self.direccion = direccion
        self.edad = edad

    def to_dict(self):
        return {
            "nombres": self.nombres,
            "direccion": self.direccion,
            "edad": self.edad
        }