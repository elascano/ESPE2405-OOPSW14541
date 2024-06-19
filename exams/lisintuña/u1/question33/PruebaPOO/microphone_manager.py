# microphone_manager.py
import json
from microphone import Microphone

class MicrophoneManager:
    def __init__(self):
        self.microphones = []

    def add_microphone(self, microphone):
        self.microphones.append(microphone)

    def save_to_json(self, filename):
        with open(filename, 'w') as file:
            json.dump([mic.to_dict() for mic in self.microphones], file, indent=4)

    def load_from_json(self, filename):
        try:
            with open(filename, 'r') as file:
                data = json.load(file)
                self.microphones = [Microphone.from_dict(item) for item in data]
        except FileNotFoundError:
            print(f"Archivo {filename} no encontrado. Iniciando con una lista vacía.")

def get_microphone_from_user():
    id = input("Ingrese ID del micrófono: ")
    brand = input("Ingrese la marca del micrófono: ")
    model = input("Ingrese el modelo del micrófono: ")
    frequency_response = input("Ingrese la respuesta de frecuencia del micrófono: ")
    return Microphone(id, brand, model, frequency_response)

def main():
    manager = MicrophoneManager()
    filename = "microphones.json"

    while True:
        print("\n1. Agregar micrófono")
        print("2. Guardar micrófonos en archivo JSON")
        print("3. Cargar micrófonos desde archivo JSON")
        print("4. Mostrar micrófonos")
        print("5. Salir")
        
        choice = input("Elija una opción: ")

        if choice == '1':
            mic = get_microphone_from_user()
            manager.add_microphone(mic)
        elif choice == '2':
            manager.save_to_json(filename)
            print(f"Micrófonos guardados en {filename}")
        elif choice == '3':
            manager.load_from_json(filename)
            print(f"Micrófonos cargados desde {filename}")
        elif choice == '4':
            for mic in manager.microphones:
                print(mic)
        elif choice == '5':
            break
        else:
            print("Opción no válida, por favor intente de nuevo.")

if __name__ == "__main__":
    main()
