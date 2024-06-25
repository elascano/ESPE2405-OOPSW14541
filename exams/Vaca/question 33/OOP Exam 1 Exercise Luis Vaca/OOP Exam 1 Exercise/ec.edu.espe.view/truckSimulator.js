const readline = require('readline-sync');
const Truck = require('../ec.edu.espe.model/Truck');
const TruckManager = require('../utils/TruckManager');

const manager = new TruckManager();

// Ingresar información a través del teclado
const id = readline.question('Ingrese el ID del camión: ');
const model = readline.question('Ingrese el modelo del camión: ');
const year = readline.questionInt('Ingrese el año del camión: ');
const color = readline.question('Ingrese el color del camión: ');

const truck = new Truck(id, model, year, color);
manager.addTruck(truck);

// Guardar en archivo JSON
manager.saveToJson('trucks.json');

// Leer desde archivo JSON
manager.loadFromJson('trucks.json');
manager.printTrucks();
