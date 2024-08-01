const { Bird } = require('./Bird.js'); // Importar clase Bird desde otro archivo

class Condor extends Bird {
    constructor(mountains, id, description, dateOnborn, gender, numberOfBones, cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
        this.mountains = mountains;
    }

    toString() {
        return `Condor{mountains=${this.mountains}, ${super.toString()}}`;
    }

    Feed(food) {
        throw new Error("Not supported yet.");
    }

    getMountains() {
        return this.mountains;
    }

    setMountains(mountains) {
        this.mountains = mountains;
    }
}

module.exports = { Condor };
