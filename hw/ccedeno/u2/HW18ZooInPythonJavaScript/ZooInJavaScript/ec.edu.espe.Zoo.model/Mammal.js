const Animal = require('../ec.edu.espe.Zoo.model/Animal');

class Mammal extends Animal {
  constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
    super(id, description, dateOnborn, gender, numberOfBones, cage);
  }
}

module.exports = Mammal;
