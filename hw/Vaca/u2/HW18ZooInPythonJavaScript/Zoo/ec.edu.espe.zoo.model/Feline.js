const Mammal = require('./Mammal');

class Feline extends Mammal {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage, furColor) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
        this.furColor = furColor;
    }

    getFurColor() {
        return this.furColor;
    }

    setFurColor(furColor) {
        this.furColor = furColor;
    }

    toString() {
        return `Feline{furColor=${this.furColor}${super.toString()}}`;
    }
}

module.exports = Feline;
