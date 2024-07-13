import { Animal } from '../model/Animal.js';
import { Cage } from '../model/Cage.js';
import { Food } from '../model/Food.js';
import { Lion } from '../model/Lion.js';
import { Monkey } from '../model/Monkey.js';
import { Shark } from '../model/Shark.js';

console.log("Carlos's Zoo!");

const cageFelines = new Cage(1, "felinesCage");
const cageMonkeys = new Cage(2, "monkeysCage");
const cageBird = new Cage(3, "birdsCage");
const pool = new Cage(4, "shark tank");
const food = new Food(1, "fish");
const animals = [];

const lion = new Lion(true, 1, "Lion Juancho", new Date(2024, 9, 10), 'm', cageFelines, 300, true);
lion.register();
lion.feed(2);
lion.feed(3, food);
animals.push(lion);
console.log("lion -->", lion);

let animal;

animal = new Monkey(2, "bear", new Date(2024, 9, 10), 'f', cageMonkeys, 0, true);
animal.feed(5);
animals.push(animal);
console.log("animal(Monkey) --> ", animal);

animal = new Lion(false, 3, "Lion Pepe", new Date(2024, 9, 10), 'f', cageFelines, 0, true);
animal.feed(4);
animals.push(animal);
console.log("animal(Lion) --> ", animal);

const shark = new Shark(4, "Baby shark", new Date(2024, 9, 10), 'm', pool, 0, true);
shark.feed(1);
animals.push(shark);
console.log("Shark --> ", shark);

console.log("Animals in my zoo --> \n", animals);
