import sys
import os

# Agrega el directorio principal del proyecto al path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

class CellPhone:
    def __init__(self, model, brand, price, quantity=1):
        self.model = model
        self.brand = brand
        self.price = price
        self.quantity = quantity
    
    def to_dict(self):
        return {
            'model': self.model,
            'brand': self.brand,
            'price': self.price,
            'quantity': self.quantity
        }