import { Fish } from './Fish.js';

export class Shark extends Fish {
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate);
    }

    feed(food) {
        console.log("Feeding a shark with fish");
    }

    toString() {
        return `Shark{${super.toString()}}`;
    }
}

