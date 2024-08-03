const Animal = require('./Animal');

class Fish extends Animal {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage, waterType) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
        this.waterType = waterType;
    }

    getWaterType() {
        return this.waterType;
    }

    setWaterType(waterType) {
        this.waterType = waterType;
    }

    toString() {
        return `Fish{waterType=${this.waterType}${super.toString()}}`;
    }
}

module.exports = Fish;
