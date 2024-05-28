const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

const SaveChickenData = require('./ec.edu.espe.chickenfarmsimulator.controller/SaveChickenData'); 
const Chicken = require('./ec.edu.espe.chickenfarmsimulator.model/Chicken');

class ChickenFarmSimulator {
    static main() {
        console.log("Domenica's Chicken Farm Simulator V. 0.5");

        const askUserForChickenData = async () => {
            const id = await new Promise((resolve) => readline.question('Enter the ID: ', resolve));
            const name = await new Promise((resolve) => readline.question('Enter the name: ', resolve));
            const color = await new Promise((resolve) => readline.question('Enter the color: ', resolve));
            const age = await new Promise((resolve) => readline.question('Enter the age: ', resolve));
            const moltingStr = await new Promise((resolve) => readline.question('Enter if its molting (true/false): ', resolve));
            const molting = moltingStr.toLowerCase() === 'true';
            const bornOnDate = new Date();

            return new Chicken(parseInt(id), name, color, parseInt(age), molting, bornOnDate);
        };

        (async () => {
            try {
                const chicken = await askUserForChickenData();
                const filePath = "./data/chickenData2.txt"; // Ruta relativa a la carpeta del archivo
                const result = await SaveChickenData.saveChickenData(chicken, filePath);
                console.log(result);
                console.log('Chicken --> \n', chicken);
            } catch (error) {
                console.error('Error:', error.message);
            } finally {
                readline.close();
            }
        })();
    }
}

module.exports = ChickenFarmSimulator;