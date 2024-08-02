const {Mammal} = require('./Mammal.js');

class Primate extends Mammal {
    constructor(id, name, birthDate, gender, numberOfLegs, cage) {
        super(id, name, birthDate, gender, numberOfLegs, cage);
    }
}

module.exports = { Primate };
