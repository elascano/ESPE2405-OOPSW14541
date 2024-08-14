const { Feline } = require('./Feline.js'); // Importar clase Feline desde otro archivo

class Tiger extends Feline {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

    Feed(food) {
        throw new Error("Not supported yet.");
    }
}

module.exports = { Tiger };
