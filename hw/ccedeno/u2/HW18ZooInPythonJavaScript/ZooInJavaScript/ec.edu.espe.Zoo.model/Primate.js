const Mammal = require('../ec.edu.espe.Zoo.model/Mammal');
class Primate extends Mammal {
  constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
    super(id, description, dateOnborn, gender, numberOfBones, cage);
  }
}

module.exports = Primate;
