const Feline = require('../ec.edu.espe.Zoo.model/Feline');
const Food = require('../ec.edu.espe.Zoo.model/Food');

class Lion extends Feline {
  constructor(mane, id, description, dateOnborn, gender, numberOfBones, cage) {
    super(id, description, dateOnborn, gender, numberOfBones, cage);
    this.mane = mane;
  }

  toString() {
    return `Lion{mane=${this.mane}, ${super.toString()}}`;
  }

  feed(food) {
    console.log("Feeding a Lion with " + food + " rats");
  }

  feedWithFood(quantity, food) {
    console.log(`Feeding the lion with ${quantity} ${food}(s)`);
    console.log(`Number of legs ${this.numberOfLegs}`);
  }

  // Getters and Setters
  isMane() {
    return this.mane;
  }

  setMane(mane) {
    this.mane = mane;
  }
}

module.exports = Lion;