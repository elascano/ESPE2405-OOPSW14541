const Animal = require('./Animal');

class Bird extends Animal {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        if (new.target === Bird) {
            throw new Error('Cannot instantiate abstract class Bird');
        }
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }
}

module.exports = Bird;