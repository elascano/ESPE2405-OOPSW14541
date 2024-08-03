const { Bird } = require('./Bird.js'); // Importar clase Bird desde otro archivo

class Eagle extends Bird {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

    Feed(food) {
        throw new Error("Not supported yet.");
    }
}

module.exports = { Eagle };
