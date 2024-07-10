const readline = require('readline');
const fs = require('fs');
const path = require('path');

class FarmSimulator {
    constructor() {
        this.rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });
        this.chickens = [];
        console.log("Enzo ChickenFarm Simulator V0.5");
    }

    run() {
        this.getChickenDetailsFromUser((chicken) => {
            this.chickens.push(chicken);
            this.displayChickenDetails(chicken);
            this.save('chicken_data.txt', this.chickens);
            this.saveToJson('chicken_data.json', this.chickens);
            console.log('Data saved to chicken_data.txt and chicken_data.json');
            this.askForAnotherChicken();
        });
    }

    askForAnotherChicken() {
        this.rl.question('Do you want to add another chicken? (yes/no): ', (answer) => {
            if (answer.toLowerCase() === 'yes') {
                this.getChickenDetailsFromUser((chicken) => {
                    this.chickens.push(chicken);
                    this.displayChickenDetails(chicken);
                    this.save('chicken_data.txt', this.chickens);
                    this.saveToJson('chicken_data.json', this.chickens);
                    console.log('Data saved to chicken_data.txt and chicken_data.json');
                    this.askForAnotherChicken();
                });
            } else {
                this.rl.close();
            }
        });
    }

    getChickenDetailsFromUser(callback) {
        this.rl.question('Enter chicken id: ', (id) => {
            this.rl.question('Enter chicken name: ', (name) => {
                this.rl.question('Enter chicken color: ', (color) => {
                    this.rl.question('Is the chicken molting? (true/false): ', (molting) => {
                        this.rl.question('Enter chicken birth date (YYYY-MM-DD): ', (bornOnDate) => {
                            const chicken = new FarmSimulator.Chicken(parseInt(id), name, color, molting === 'true', bornOnDate);
                            callback(chicken);
                        });
                    });
                });
            });
        });
    }

    displayChickenDetails(chicken) {
        console.log('Chicken Details: ' + chicken.toString());
    }

    save(filename, chickens) {
        const filePath = path.resolve(__dirname, filename);
        const data = chickens.map(chicken => chicken.toString()).join('\n');
        fs.writeFileSync(filePath, data);
    }

    saveToJson(filename, chickens) {
        const filePath = path.resolve(__dirname, filename);
        const data = JSON.stringify(chickens, null, 2);
        fs.writeFileSync(filePath, data);
    }
}

FarmSimulator.Chicken = class {
    constructor(id, name, color, molting, bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.molting = molting;
        this.bornOnDate = new Date(bornOnDate);
        this.age = this.calculateAge();
    }

    calculateAge() {
        const currentDate = new Date();
        let age = currentDate.getFullYear() - this.bornOnDate.getFullYear();
        const monthDiff = currentDate.getMonth() - this.bornOnDate.getMonth();
        if (monthDiff < 0 || (monthDiff === 0 && currentDate.getDate() < this.bornOnDate.getDate())) {
            age--;
        }
        return age;
    }

    toString() {
        return `Chicken{id=${this.id}, name=${this.name}, color=${this.color}, age=${this.age}, molting=${this.molting}, bornOnDate=${this.bornOnDate}}`;
    }
};

const farmSimulator = new FarmSimulator();
farmSimulator.run();
