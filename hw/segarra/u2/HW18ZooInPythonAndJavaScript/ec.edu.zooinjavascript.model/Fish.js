import Animal from "./Animal.js";

export default class Fish extends Animal{
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate){
        if (new.target === Fish) {
            throw new TypeError("Cannot construct Bird instances directly");
        }
        super(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate)
    }
}