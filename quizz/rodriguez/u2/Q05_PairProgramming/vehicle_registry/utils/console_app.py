from ec_edu_espe_vehicle_registry_controller.vehicle_manager import VehicleManager
from ec_edu_espe_vehicle_registry_model.vehicle import Car, Truck

class ConsoleApp:
    @staticmethod
    def run():
        manager = VehicleManager()

        while True:
            ConsoleApp.print_menu()
            choice = input("Enter your choice (1-6): ")

            if choice == "1":
                ConsoleApp.add_vehicle(manager)
            elif choice == "2":
                manager.listVehicles()
            elif choice == "3":
                ConsoleApp.view_vehicles_by_type(manager)
            elif choice == "4":
                ConsoleApp.edit_vehicle(manager)
            elif choice == "5":
                ConsoleApp.delete_vehicle(manager)
            elif choice == "6":
                print("Exiting...")
                break
            else:
                print("Invalid choice. Please enter a number from 1 to 6.")

        # Save vehicles to JSON file upon exit
        manager.saveVehicles()
        print(f"Vehicles saved to '{manager.file_path}'.")

    @staticmethod
    def print_menu():
        print("\n*** Vehicle Registry Application ***")
        print("1. Add a new vehicle")
        print("2. View all vehicles")
        print("3. View vehicles by type (Car or Truck)")
        print("4. Edit a vehicle")
        print("5. Delete a vehicle")
        print("6. Exit")

    @staticmethod
    def add_vehicle(manager):
        print("\n--- Add a new vehicle ---")
        license_plate = input("Enter the license plate of the vehicle (format: ABC1234): ")
        model = input("Enter the model of the vehicle: ")
        brand = input("Enter the brand of the vehicle: ")
        year = int(input("Enter the year of the vehicle: "))
        price = float(input("Enter the price of the vehicle: "))
        type = input("Enter the type of vehicle (Car or Truck): ")

        if type == "Car":
            numberOfDoors = int(input("Enter the number of doors of the vehicle: "))
            vehicle = Car(license_plate, model, brand, year, price, numberOfDoors)
        elif type == "Truck":
            loadCapacity = float(input("Enter the load capacity of the vehicle: "))
            vehicle = Truck(license_plate, model, brand, year, price, loadCapacity)
        else:
            print("Invalid vehicle type. Please enter 'Car' or 'Truck'.")
            return

        manager.addVehicle(vehicle)
        print("Vehicle added successfully!")

    @staticmethod
    def view_vehicles_by_type(manager):
        print("\n--- View Vehicles by Type ---")
        type = input("Enter the type of vehicles to view (Car or Truck): ")
        filtered_vehicles = [v for v in manager.vehicles if v.type == type]
        if filtered_vehicles:
            for vehicle in filtered_vehicles:
                ConsoleApp.print_vehicle(vehicle)
        else:
            print(f"No vehicles of type '{type}' found.")

    @staticmethod
    def edit_vehicle(manager):
        print("\n--- Edit a Vehicle ---")
        license_plate = input("Enter the license plate of the vehicle to edit: ")
        vehicle = manager.getVehicle(license_plate)
        if vehicle:
            print("\nCurrent details of the vehicle:")
            ConsoleApp.print_vehicle(vehicle)
            print("\nEnter new details:")
            model = input("Enter the new model of the vehicle (press Enter to keep current): ")
            if model:
                vehicle.model = model
            brand = input("Enter the new brand of the vehicle (press Enter to keep current): ")
            if brand:
                vehicle.brand = brand
            year = input("Enter the new year of the vehicle (press Enter to keep current): ")
            if year:
                vehicle.year = int(year)
            price = input("Enter the new price of the vehicle (press Enter to keep current): ")
            if price:
                vehicle.price = float(price)
            if isinstance(vehicle, Car):
                doors = input("Enter the new number of doors (press Enter to keep current): ")
                if doors:
                    vehicle.numberOfDoors = int(doors)
            elif isinstance(vehicle, Truck):
                capacity = input("Enter the new load capacity (press Enter to keep current): ")
                if capacity:
                    vehicle.loadCapacity = float(capacity)
            print("Vehicle edited successfully!")
        else:
            print(f"Vehicle with license plate '{license_plate}' not found.")

    @staticmethod
    def delete_vehicle(manager):
        print("\n--- Delete a Vehicle ---")
        license_plate = input("Enter the license plate of the vehicle to delete: ")
        vehicle = manager.getVehicle(license_plate)
        if vehicle:
            manager.removeVehicle(license_plate)
            print(f"Vehicle with license plate '{license_plate}' deleted successfully!")
        else:
            print(f"Vehicle with license plate '{license_plate}' not found.")

    @staticmethod
    def print_vehicle(vehicle):
        print(f"License Plate: {vehicle.license_plate}")
        print(f"Model: {vehicle.model}")
        print(f"Brand: {vehicle.brand}")
        print(f"Year: {vehicle.year}")
        print(f"Price: {vehicle.price}")
        print(f"Type: {vehicle.type}")
        if isinstance(vehicle, Car):
            print(f"Number of Doors: {vehicle.numberOfDoors}")
        elif isinstance(vehicle, Truck):
            print(f"Load Capacity: {vehicle.loadCapacity}")
        print("---------------------")
