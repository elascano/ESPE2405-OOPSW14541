import Animal from "./Animal.js";

export default class Bird extends Animal{
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate){
        if (new.target === Bird) {
            throw new TypeError("Cannot construct Bird instances directly");
        }
        super(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate)
    }
}