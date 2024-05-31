const readline = require('readline');
const { DateTime, Interval } = require('luxon');
const Chicken = require('../ec.edu.espe.farmsimulator.model/Chicken');
const FileManager = require('../utils/FileManager');
const DateValidator = require('../utils/DateValidator');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

class ChickenFarmSimulator {
    static async main() {
        console.log("Andre's Chicken Farm Simulator V 0.5");

        const id = await this.askQuestion("Enter the ID for the chicken: ");
        const name = await this.askQuestion("Enter the name of the chicken: ");
        const color = await this.askQuestion("Enter the color of the chicken: ");
        const molting = await this.askQuestion("The chicken is molting? (true or false): ");
        
        const birthDate = await DateValidator.getValidDate();
        const currentDate = DateTime.now();

        const period = Interval.fromDateTimes(birthDate, currentDate).toDuration(['years', 'months', 'days']);
        const year = Math.floor(period.years);
        const month = Math.floor(period.months);
        const day = Math.floor(period.days);

        const chicken = new Chicken(parseInt(id), name, color, molting === 'true', year, month, day);

        const validOption = await DateValidator.getValidOption();
        
        FileManager.save(chicken.toStringType(1), "chickens", validOption - 1);

        rl.close();
    }

    static askQuestion(query) {
        return new Promise(resolve => rl.question(query, resolve));
    }
}

// Ejecutar el simulador
ChickenFarmSimulator.main();
