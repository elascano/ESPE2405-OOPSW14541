import { Mammal } from './Mammal.js';

export class Feline extends Mammal {
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate);
    }
}
