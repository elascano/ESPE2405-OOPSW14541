const Animal = require('./Animal');

class Bird extends Animal {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage, wingSpan) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
        this.wingSpan = wingSpan;
    }

    getWingSpan() {
        return this.wingSpan;
    }

    setWingSpan(wingSpan) {
        this.wingSpan = wingSpan;
    }

    toString() {
        return `Bird{wingSpan=${this.wingSpan}${super.toString()}}`;
    }
}

module.exports = Bird;
