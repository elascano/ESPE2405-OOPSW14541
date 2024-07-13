import { Feline } from './Feline.js';

export class Lion extends Feline {
    constructor(mane, id, description, bornOnDate, gender, cage, numberOfBones, vetebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate);
        this.mane = mane;
    }

    feed(food) {
        console.log(`Feeding the lion with ${food} units`);
    }

    toString() {
        return `Lion{mane=${this.mane}, ${super.toString()}}`;
    }
}

