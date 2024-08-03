const Mammal = require('./Mammal');

class Primate extends Mammal {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

    // Additional methods specific to Primate can be added here

    toString() {
        return `Primate${super.toString()}`;
    }
}

module.exports = Primate;
