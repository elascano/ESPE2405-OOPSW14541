const Animal = require('./Animal');

class Mammal extends Animal {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        if (new.target === Mammal) {
            throw new Error('Cannot instantiate abstract class Mammal');
        }
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }
}

module.exports = Mammal;