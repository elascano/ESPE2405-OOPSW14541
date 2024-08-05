const Animal = require('./Animal');

class Mammal extends Animal {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

    // Additional methods specific to Mammal can be added here

    toString() {
        return `Mammal${super.toString()}`;
    }
}

module.exports = Mammal;
