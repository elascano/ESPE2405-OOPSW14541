const { Animal } = require('./Animal.js'); // Importar clase Animal desde otro archivo

class Mammal extends Animal {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }
}

module.exports = { Mammal };
