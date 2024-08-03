const Feline = require('./Feline');

class Tiger extends Feline {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage, furColor) {
        super(id, description, dateOnborn, gender, numberOfBones, cage, furColor);
    }

    // Additional methods specific to Tiger can be added here

    toString() {
        return `Tiger{furColor=${this.furColor}${super.toString()}}`;
    }
}

module.exports = Tiger;
