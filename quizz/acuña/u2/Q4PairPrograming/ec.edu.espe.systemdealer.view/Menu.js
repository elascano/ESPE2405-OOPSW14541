const readline = require('readline');
const Dealership = require('../ec.edu.espe.systemdealer.model/Dealership');
const Vehicle = require('../ec.edu.espe.systemdealer.model/Vehicle');
const FileManager = require('../utils/FileManager');

class Menu {
    constructor(dealership, fileManager) {
        this.dealership = dealership;
        this.fileManager = fileManager;
        this.loadVehicles();
        this.rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });
    }

    showMenu() {
        console.log('\n1. Agregar vehículo');
        console.log('2. Ver vehículos');
        console.log('3. Vender vehículo');
        console.log('4. Salir');
        this.rl.question('Seleccione una opción: ', (option) => {
            switch (option) {
                case '1':
                    this.addVehicle();
                    break;
                case '2':
                    this.viewVehicles();
                    break;
                case '3':
                    this.sellVehicle();
                    break;
                case '4':
                    this.rl.close();
                    break;
                default:
                    console.log('Opción inválida');
                    this.showMenu();
            }
        });
    }

    addVehicle() {
        this.rl.question('ID: ', (id) => {
            this.rl.question('Marca: ', (brand) => {
                this.rl.question('Modelo: ', (model) => {
                    this.rl.question('Color: ', (color) => {
                        this.rl.question('Año: ', (year) => {
                            const vehicle = new Vehicle(id, brand, model, color, parseInt(year));
                            this.dealership.addVehicle(vehicle);
                            console.log('Vehículo agregado');
                            this.showMenu();
                        });
                    });
                });
            });
        });
    }

    viewVehicles() {
        console.log('Vehículos:', this.dealership.viewCars());
        this.showMenu();
    }

    sellVehicle() {
        this.rl.question('ID del vehículo a vender: ', (id) => {
            this.dealership.sellVehicle(id);
            console.log('Vehículo vendido');
            this.showMenu();
        });
    }

    saveAndContinue() {
        this.fileManager.saveData('vehicles.json', this.dealership.viewCars());
        console.log('Vehículos guardados automáticamente en vehicles.json');
        this.showMenu();
    }

    loadVehicles(){
        this.dealership.loadVehicles();
        
    }

}

module.exports = Menu;
