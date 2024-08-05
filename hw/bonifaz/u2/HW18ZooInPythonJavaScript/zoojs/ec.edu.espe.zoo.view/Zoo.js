const {Cage} = require('../ec.edu.espe.zoo.model/Cage.js');
const {Food} = require('../ec.edu.espe.zoo.model/Food.js');
const {Lion} = require('../ec.edu.espe.zoo.model/Lion.js');
const {Monkey} = require('../ec.edu.espe.zoo.model/Monkey.js');
const {Shark }= require('../ec.edu.espe.zoo.model/Shark.js');

console.log("Christian's Zoo");

const cageFelines = new Cage(1, "FelinesCage");
const cageMonkeys = new Cage(2, "monkeysCage");
const cageBirds = new Cage(3, "BirdsCage");
const pool = new Cage(4, "Pool for Shark");
const food = new Food(1, "Fish");
const animals = [];

const lion = new Lion(true, 1, "Lion Toto", new Date(2024, 9, 10), 'f', 0, cageFelines);
lion.register(cageFelines);
animals.push(lion);
lion.Feed(2);
lion.feed(3, food);
console.log("Lion --> ", lion);

let animal;

animal = new Monkey(2, "bear", new Date(2024, 4, 3), 'f', 0, cageMonkeys);
animal.Feed(5);
animals.push(animal);
console.log("Animal (monkey) --> ", animal);

animal = new Lion(false, 2, "Lion Alexa", new Date(2024, 4, 3), 'f', 0, cageFelines);
animal.Feed(4);
animals.push(animal);
console.log("Animal (lion) --> ", animal);

const shark = new Shark(1, "Dad Shark", new Date(2024, 5, 7), 'f', 0, pool);
shark.Feed(6);
animals.push(shark);
console.log("Animal (shark) --> ", shark);

console.log("Animals in Christian's Zoo --> \n", animals);

for (let an1 of animals) {
    console.log(an1);
}
