const Bird = require('./Bird');
const Cage = require('./Cage'); 

class Condor extends Bird {
    
    constructor(mountains, id, description, dateOnborn, gender, numberOfBones, cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
        this._mountains = mountains;
    }

    toString() {
        return `Condor{mountains=${this._mountains}, ${super.toString()}}`;
    }

    feed(food) {
        throw new Error('Not supported yet.');
    }

    get mountains() {
        return this._mountains;
    }

    set mountains(mountains) {
        this._mountains = mountains;
    }
}

module.exports = Condor;