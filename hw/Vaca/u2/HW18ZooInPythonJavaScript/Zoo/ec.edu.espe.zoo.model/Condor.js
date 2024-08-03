const Bird = require('./Bird');

class Condor extends Bird {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage, wingSpan) {
        super(id, description, dateOnborn, gender, numberOfBones, cage, wingSpan);
    }
    
    toString() {
        return `Condor{wingSpan=${this.wingSpan}${super.toString()}}`;
    }
}

module.exports = Condor;
 