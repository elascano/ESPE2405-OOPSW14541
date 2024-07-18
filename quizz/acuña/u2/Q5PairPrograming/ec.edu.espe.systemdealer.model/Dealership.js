const Vehicle = require('./Vehicle');
const FileManager = require('../utils/FileManager');

class Dealership {
    constructor(brand) {
        this.brand = brand;
        this.vehicles = [];
        this.fileManager = new FileManager(); 
    }

    addVehicle(vehicle) {
        this.vehicles.push(vehicle);
        this.saveVehicles(); 
    }

    sellVehicle(id) {
        this.vehicles = this.vehicles.filter(vehicle => vehicle.id !== id);
        this.saveVehicles(); 
    }

    viewCars() {
        return this.vehicles;
    }

    calculateAmount() {
        return this.vehicles.length;
    }

    saveVehicles() {
        this.fileManager.saveData(this.brand, this.viewCars());
    }

    loadVehicles() {
        const loadedVehicles = this.fileManager.loadData(this.brand);
        this.vehicles = []; 

        loadedVehicles.forEach(vehicleData => {
            const vehicle = new Vehicle(vehicleData.id, vehicleData.brand, vehicleData.model, vehicleData.color, vehicleData.year);
            this.vehicles.push(vehicle);
        });
    }
}

module.exports = Dealership;
