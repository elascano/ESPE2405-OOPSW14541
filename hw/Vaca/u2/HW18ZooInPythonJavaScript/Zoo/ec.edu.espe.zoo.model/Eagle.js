const Bird = require('./Bird');

class Eagle extends Bird {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage, wingSpan) {
        super(id, description, dateOnborn, gender, numberOfBones, cage, wingSpan);
    }

    toString() {
        return `Eagle{wingSpan=${this.wingSpan}${super.toString()}}`;
    }
}

module.exports = Eagle;
