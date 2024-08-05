const Primate = require('./Primate');

class Monkey extends Primate {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage, tailLength) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
        this.tailLength = tailLength;
    }

    getTailLength() {
        return this.tailLength;
    }

    setTailLength(tailLength) {
        this.tailLength = tailLength;
    }

    toString() {
        return `Monkey{tailLength=${this.tailLength}${super.toString()}}`;
    }
}

module.exports = Monkey;
