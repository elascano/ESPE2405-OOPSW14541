const {Mammal} = require('./Mammal.js');

class Feline extends Mammal {
    constructor(id, name, birthDate, gender, numberOfLegs, cage) {
        super(id, name, birthDate, gender, numberOfLegs, cage);
    }
}

module.exports = { Feline };
