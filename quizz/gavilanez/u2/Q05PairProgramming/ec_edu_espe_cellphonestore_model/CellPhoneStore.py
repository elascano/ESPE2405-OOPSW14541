import sys
import os

# Agrega el directorio principal del proyecto al path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

import json
from prettytable import PrettyTable
from ec_edu_espe_cellphonestore_model.CellPhone import CellPhone

class CellPhoneStore:
    def __init__(self, store_id):
        self.store_id = store_id
        self.inventory = {}
        self.filename = f"store_{store_id}_inventory.json"
        self.load_from_file()

    def add_phone(self):
        print("Ingrese los datos del celular:")
        model = input("Modelo: ")
        brand = input("Marca: ")
        
        while True:
            try:
                price = float(input("Precio: $"))
                break
            except ValueError:
                print("Por favor, ingrese un precio válido.")
        
        quantity = int(input("Cantidad: "))

        if model in self.inventory:
            self.inventory[model].quantity += quantity
        else:
            self.inventory[model] = CellPhone(model, brand, price, quantity)
        
        self.save_to_file()
        print(f"Añadido: {quantity} x {brand} {model} - Precio: ${price} c/u")
    
    def sell_phone(self, model):
        if model in self.inventory:
            phone = self.inventory[model]
            if phone.quantity > 0:
                phone.quantity -= 1
                if phone.quantity == 0:
                    del self.inventory[model]
                self.save_to_file()
                print(f"Vendido: {phone.brand} {phone.model}")
                return True
        return False
    
    def delete_phone(self, model, quantity):
        if model in self.inventory:
            phone = self.inventory[model]
            if phone.quantity >= quantity:
                phone.quantity -= quantity
                if phone.quantity == 0:
                    del self.inventory[model]
                self.save_to_file()
                print(f"Eliminado: {quantity} x {phone.brand} {phone.model}")
            else:
                print(f"No se puede eliminar {quantity} unidades. Solo hay {phone.quantity} disponibles.")
        else:
            print(f"No se encontró el celular {model} en el inventario.")
    
    def modify_phone(self, model):
        if model in self.inventory:
            print(f"Modificando {model}:")
            brand = input(f"Nueva marca (actual: {self.inventory[model].brand}): ") or self.inventory[model].brand
            while True:
                try:
                    price = input(f"Nuevo precio (actual: ${self.inventory[model].price}): ")
                    price = float(price) if price else self.inventory[model].price
                    break
                except ValueError:
                    print("Por favor, ingrese un precio válido.")
            
            quantity = input(f"Nueva cantidad (actual: {self.inventory[model].quantity}): ")
            quantity = int(quantity) if quantity else self.inventory[model].quantity

            self.inventory[model] = CellPhone(model, brand, price, quantity)
            self.save_to_file()
            print(f"Celular {model} modificado.")
        else:
            print(f"No se encontró el celular {model} en el inventario.")
    
    def show_inventory(self):
        table = PrettyTable()
        table.field_names = ["Modelo", "Marca", "Precio", "Cantidad"]

        for phone in self.inventory.values():
            table.add_row([phone.model, phone.brand, phone.price, phone.quantity])
        
        print(f"Inventario de la tienda {self.store_id}:")
        print(table)
    
    def save_to_file(self):
        with open(self.filename, 'w') as f:
            json.dump([phone.to_dict() for phone in self.inventory.values()], f, indent=4)
        print(f"Datos guardados en {self.filename}")

    def load_from_file(self):
        if os.path.exists(self.filename):
            with open(self.filename, 'r') as f:
                data = json.load(f)
                self.inventory = {phone['model']: CellPhone(phone['model'], phone['brand'], phone['price'], phone['quantity']) for phone in data}
            print(f"Datos cargados desde {self.filename}")

    def show_all_inventories():
        for store_id in ['1', '2']:
                store = CellPhoneStore(store_id)
                store.show_inventory()

    def sell_phone_in_any_store(model):
        for store_id in ['1', '2']:
                store = CellPhoneStore(store_id)
                if store.sell_phone(model):
                        return
        print(f"No se encontró el celular {model} en ningún inventario.")

    def modify_phone_in_any_store(model):
        for store_id in ['1', '2']:
                store = CellPhoneStore(store_id)
                if model in store.inventory:
                        store.modify_phone(model)
                        return
        print(f"No se encontró el celular {model} en ningún inventario.")