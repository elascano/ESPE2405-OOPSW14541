const Lion = require('../models/Lion');
const Cage = require('../models/Cage');
const Food = require('../models/Food');
const Animal = require('../models/Animal');
const Monkey = require('../models/Monkey');

class Zoo {
    constructor(name) {
        this.name = name;
        this.animals = [];
    }

    addAnimal(animal) {
        this.animals.push(animal);
    }

    feedAnimal(animal, food, quantity) {
        console.log(`Feeding a ${animal.constructor.name} with ${quantity} ${food.description}(s)`);
    }

    displayAnimals() {
        console.log(`Animals in ${this.name} Zoo --> \n ${this.animals.map(animal => animal.toString()).join(', ')}`);
    }
}

// Example usage
const zoo = new Zoo("Luis's Zoo");

const cage1 = new Cage(1, 'FelinesCage');
const lion1 = new Lion(1, 'Lion Alex', 'Mon Nov 10 00:00:00 ECT 3924', 'f', 0, cage1, true);
zoo.addAnimal(lion1);
zoo.feedAnimal(lion1, new Food(1, 'rats'), 2);
zoo.feedAnimal(lion1, new Food(1, 'Fish'), 3);

console.log(`Lion --> ${lion1.toString()}`);

const cage2 = new Cage(2, 'monkeysCage');
const monkey = new Monkey(2, 'bear', 'Tue Jun 03 00:00:00 ECT 3924', 'f', 0, cage2, 'long');
zoo.addAnimal(monkey);
zoo.feedAnimal(monkey, new Food(1, 'bananas'), 1);

console.log(`Animal (monkey) --> ${monkey.toString()}`);

zoo.displayAnimals();
