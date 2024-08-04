const Fish = require('../ec.edu.espe.Zoo.model/Fish');

class Shark extends Fish {
  constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
    super(id, description, dateOnborn, gender, numberOfBones, cage);
  }

  feed(food) {
    console.log("Feeding a Shark");
  }
}

module.exports = Shark;
