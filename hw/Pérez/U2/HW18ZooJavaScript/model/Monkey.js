import { Mammal } from './Mammal.js';

export class Monkey extends Mammal {
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate);
    }

    feed(food) {
        console.log(`Feeding the monkey with ${food} units`);
    }

    toString() {
        return `Monkey{${super.toString()}}`;
    }
}

