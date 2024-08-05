const Mammal = require('./Mammal');

class Feline extends Mammal {

    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        if (new.target === Feline) {
            throw new Error('Cannot instantiate abstract class Feline');
        }
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }
}

module.exports = Feline;