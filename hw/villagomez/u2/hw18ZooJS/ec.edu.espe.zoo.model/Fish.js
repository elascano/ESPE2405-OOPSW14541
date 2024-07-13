const Animal = require('./Animal');
const Cage = require('./Cage'); 

class Fish extends Animal {

    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        if (new.target === Fish) {
            throw new Error('Cannot instantiate abstract class Fish');
        }
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }
}

module.exports = Fish;