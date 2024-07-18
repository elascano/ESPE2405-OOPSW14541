const { Animal } = require('./Animal.js'); // Importar clase Animal desde otro archivo

class Fish extends Animal {
    constructor(id, name, birthDate, gender, numberOfLegs, cage) {
        super(id, name, birthDate, gender, numberOfLegs, cage);
    }
}

module.exports = { Fish };
