import Mammal from "./Mammal.js";

export default class Feline extends Mammal{
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate){
        if (new.target === Feline) {
            throw new TypeError("Cannot construct Feline instances directly");
        }
        super(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate)
    }
}