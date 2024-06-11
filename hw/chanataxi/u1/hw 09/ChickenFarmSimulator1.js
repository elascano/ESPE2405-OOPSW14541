// chickenFarmSimulator.js

const fs = require('fs');

// Model
class Chicken {
    constructor(id, name, color, age, molting, bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
        this.bornOnDate = bornOnDate;
    }

    toString() {
        return `Chicken{id=${this.id}, name=${this.name}, color=${this.color}, age=${this.age}, molting=${this.molting}, bornOnDate=${this.bornOnDate}}`;
    }
}

// View
class ChickenView {
    displayChickenDetails(chicken) {
        console.log(`Chicken Details: ${chicken}`);
    }
}

// Controller
class ChickenController {
    constructor(model, view) {
        this.model = model;
        this.view = view;
    }

    setChickenDetails(id, name, color, age, molting, bornOnDate) {
        this.model.id = id;
        this.model.name = name;
        this.model.color = color;
        this.model.age = age;
        this.model.molting = molting;
        this.model.bornOnDate = bornOnDate;
    }

    getChickenDetails() {
        return this.model;
    }

    updateView() {
        this.view.displayChickenDetails(this.model);
    }

    saveToFile(filename) {
        fs.writeFile(filename, this.model.toString(), (err) => {
            if (err) throw err;
            console.log(`Data saved to ${filename}`);
        });
    }
}

// Main function to simulate the chicken farm
function main() {
    console.log("Marco ChickenFarm Simulator V0.5");

    let chicken = new Chicken(1, "Lucy", "Brown", 0, true, new Date());
    let view = new ChickenView();
    let controller = new ChickenController(chicken, view);

    controller.updateView();

    let id = 2;
    let name = "Maruja";
    let color = "black";
    let age = 1;
    let molting = false;
    let bornOnDate = new Date();

    controller.setChickenDetails(id, name, color, age, molting, bornOnDate);
    controller.updateView();
    controller.saveToFile("chicken_data.txt");
}

main();

