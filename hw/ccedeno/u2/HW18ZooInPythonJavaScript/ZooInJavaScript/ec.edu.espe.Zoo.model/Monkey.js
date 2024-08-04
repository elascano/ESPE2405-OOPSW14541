const Primate = require('../ec.edu.espe.Zoo.model/Primate');

class Monkey extends Primate {
  constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
    super(id, description, dateOnborn, gender, numberOfBones, cage);
  }

  feed(food) {
    console.log("Feeding a monkey");
  }
}

module.exports = Monkey;
