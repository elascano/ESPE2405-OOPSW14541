const { Animal } = require('./Animal.js');

class Bird extends Animal {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }
}

module.exports = { Bird };
