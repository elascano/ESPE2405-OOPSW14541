const Mammal = require('./Mammal');

class Primate extends Mammal {

    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        if (new.target === Primate) {
            throw new Error('Cannot instantiate abstract class Primate');
        }
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }
}

module.exports = Primate;