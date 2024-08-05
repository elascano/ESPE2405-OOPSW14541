
import Cage from "../ec.edu.zooinjavascript.model/Cage.js";
import Food from "../ec.edu.zooinjavascript.model/Food.js";
import Condor from "../ec.edu.zooinjavascript.model/Condor.js";
import Eagle from "../ec.edu.zooinjavascript.model/Eagle.js";
import Shark from "../ec.edu.zooinjavascript.model/Shark.js";
import Monkey from "../ec.edu.zooinjavascript.model/Monkey.js";
import Lion from "../ec.edu.zooinjavascript.model/Lion.js";
import Tiger from "../ec.edu.zooinjavascript.model/Tiger.js";
import Animal from "../ec.edu.zooinjavascript.model/Animal.js";

console.log("Eduardo's Zoo!");

const cageFelines = new Cage(1, "felinesCage");
const cageMonkeys = new Cage(2, "monkeysCage");
const cageBirds = new Cage(3, "birdsCage");
const pool = new Cage(4, "shark tank");
const food = new Food(1, "fish");

const lion = new Lion(1, 'Lion Juancho', new Date(2004, 7, 11), 'm', cageFelines, 223, true);
lion.feed(1, food);
lion.register();

let animal = new Animal;

animal = new Condor(2, "Condor andino", new Date(2004, 7, 11), "f", cageBirds, 156, true);
animal.feed();
animal.register();
console.log(`this animal is --> ${animal.getDescriptionProtected()}`);

animal = new Monkey(3, "Macaco", new Date(2014, 9, 24) , "m", cageMonkeys, 183, true);
animal.feed();
animal.register();
console.log(`this animal is --> ${animal.getDescriptionProtected()}`);

animal = new Shark(4, "Baby shark", new Date(2005, 8, 16), "m", pool, 130, true);
animal.feed();
animal.register();
console.log(`this animal is --> ${animal.getDescriptionProtected()}`);

animal = new Tiger(5, "Tigre toño", new Date(2016, 2, 2), "m", cageFelines, 230, true);
animal.feed();
animal.register();
console.log(`this animal is --> ${animal.getDescriptionProtected()}`);

animal = new Eagle(6, "Aguily", new Date(2022, 6, 7), "f", cageBirds, 134, true);
animal.feed();
animal.register();
console.log(`this animal is --> ${animal.getDescriptionProtected()}`);