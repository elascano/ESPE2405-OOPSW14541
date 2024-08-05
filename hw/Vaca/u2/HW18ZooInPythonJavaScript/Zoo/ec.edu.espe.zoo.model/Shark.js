const Fish = require('./Fish');

class Shark extends Fish {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage, waterType) {
        super(id, description, dateOnborn, gender, numberOfBones, cage, waterType);
    }

    // Additional methods specific to Shark can be added here

    toString() {
        return `Shark{waterType=${this.waterType}${super.toString()}}`;
    }
}

module.exports = Shark;
