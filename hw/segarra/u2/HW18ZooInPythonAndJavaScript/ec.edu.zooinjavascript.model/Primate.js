import Mammal from "./Mammal.js";

export default class Primate extends Mammal{
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate){
        if (new.target === Primate) {
            throw new TypeError("Cannot construct Primate instances directly");
        }
        super(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate)
    }
}