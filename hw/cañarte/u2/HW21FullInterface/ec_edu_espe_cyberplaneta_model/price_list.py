class PriceList:
    def __init__(self, id, nombre, precio, impuesto):
        self.id = id
        self.nombre = nombre
        self.precio = precio
        self.impuesto = impuesto

price_list = [
    PriceList(1, "Declaracion de IVA en 0", 5.0, 15.0),
    PriceList(2, "Declaracion de IVA mensual", 20.0, 15.0),
    PriceList(3, "Declaracion de IVA semestral", 50.0, 15.0),
    PriceList(4, "Devolucion Impuesto a la Renta", 3.5, 15.0),
    PriceList(5, "Anexo de Accionista", 5.0, 15.0)
]