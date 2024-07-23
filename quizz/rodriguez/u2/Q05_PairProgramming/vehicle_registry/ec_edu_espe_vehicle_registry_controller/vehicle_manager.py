from ec_edu_espe_vehicle_registry_model.vehicle import Vehicle, Car, Truck
import json

class VehicleManager:
    def __init__(self):
        self.vehicles = []
        self.file_path = "vehicles.json"
        self.loadVehicles()

    def addVehicle(self, vehicle):
        self.vehicles.append(vehicle)

    def removeVehicle(self, license_plate):
        self.vehicles = [v for v in self.vehicles if v.license_plate != license_plate]

    def getVehicle(self, license_plate):
        for vehicle in self.vehicles:
            if vehicle.license_plate == license_plate:
                return vehicle
        return None

    def listVehicles(self):
        for vehicle in self.vehicles:
            print(vehicle)

    def saveVehicles(self):
        vehicles_data = [vars(vehicle) for vehicle in self.vehicles]
        with open(self.file_path, 'w') as file:
            json.dump(vehicles_data, file, indent=4)

    def loadVehicles(self):
        try:
            with open(self.file_path, 'r') as file:
                vehicles_data = json.load(file)
                for data in vehicles_data:
                    vehicle_type = data.pop('type')  # Eliminar la clave 'type'
                    if vehicle_type == 'Car':
                        vehicle = Car(**data)
                    elif vehicle_type == 'Truck':
                        vehicle = Truck(**data)
                    self.vehicles.append(vehicle)
        except FileNotFoundError:
            pass
