const fs = require('fs');
const Truck = require('../ec.edu.espe.model/Truck');

class TruckManager {
    constructor() {
        this.trucks = [];
    }

    addTruck(truck) {
        this.trucks.push(truck);
    }

    saveToJson(filename) {
        const truckList = this.trucks.map(truck => truck.toJSON());
        fs.writeFileSync(filename, JSON.stringify(truckList, null, 2), 'utf-8');
    }

    loadFromJson(filename) {
        const data = fs.readFileSync(filename, 'utf-8');
        const truckList = JSON.parse(data);
        this.trucks = truckList.map(truck => Truck.fromJSON(truck));
    }

    printTrucks() {
        this.trucks.forEach(truck => console.log(truck));
    }
}

module.exports = TruckManager;
