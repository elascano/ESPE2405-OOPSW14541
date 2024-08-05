const Animal = require('../ec.edu.espe.Zoo.model/Animal');

class Bird extends Animal {
  constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
    super(id, description, dateOnborn, gender, numberOfBones, cage);
  }
}

module.exports = Bird;
