const Feline = require('./Feline');

class Lion extends Feline {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage, mane) {
        super(id, description, dateOnborn, gender, numberOfBones, cage, furColor);
        this.mane = mane;
    }

    toString() {
        return `Lion{mane=${this.mane}${super.toString()}}`;
    }
}

module.exports = Lion;
