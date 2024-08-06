import Animal from "./Animal.js";

export default class Mammal extends Animal{
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate){
        if (new.target === Mammal) {
            throw new TypeError("Cannot construct Mammal instances directly");
        }
        super(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate)
    }
}