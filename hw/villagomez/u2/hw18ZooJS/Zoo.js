//const { Animal, Lion, Monkey, Shark, Cage, Food } = require('./ec.edu.espe.zoo.model'); 
const Lion = require('./ec.edu.espe.zoo.model/Lion');
const Monkey = require('./ec.edu.espe.zoo.model/Monkey');
const Shark = require('./ec.edu.espe.zoo.model/Shark');
const Condor = require('./ec.edu.espe.zoo.model/Condor');
const Eagle = require('./ec.edu.espe.zoo.model/Eagle');
const Cage = require('./ec.edu.espe.zoo.model/Cage');
const Food = require('./ec.edu.espe.zoo.model/Food');

const animals = [];

console.log("Domenica's Zoo");

let cageFelines = new Cage(1, "FelinesCage");
let cageMonkeys = new Cage(2, "monkeysCage");
let cageBirds = new Cage(3, "BirdsCage");
let pool = new Cage(4, "Pool for Shark");

let food = new Food(1, "Fish");

const lion = new Lion(true, 1, "Lion Patricio", new Date(2024, 10, 10), 'f', 0, cageFelines);
lion.register(cageFelines);
animals.push(lion);
lion.feed(2);
lion.feed(3, food);
console.log("Lion --> ", lion);

let animal;

animal = new Monkey(2, "Furry", new Date(2024, 5, 3), 'f', 0, cageMonkeys);
animal.feed(5);
animals.push(animal);
console.log("Animal (monkey) --> ", animal);

animal = new Lion(false, 2, "Lion Percy", new Date(2024, 5, 3), 'f', 0, cageFelines);
animal.feed(4);
animals.push(animal);
console.log("Animal (lion) --> ", animal);

const shark = new Shark(1, "Dad Shark", new Date(2024, 6, 7), 'f', 0, pool);
animal.feed(6);
animals.push(shark);
console.log("Animal (shark) --> ", shark);

console.log("Animals in Domenica's Zoo --> \n", animals);

for (let animal of animals) {
    console.log(animal);
}
