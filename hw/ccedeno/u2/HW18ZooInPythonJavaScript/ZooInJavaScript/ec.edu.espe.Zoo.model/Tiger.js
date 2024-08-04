const Feline = require('../ec.edu.espe.Zoo.model/Feline');

class Tiger extends Feline {
  constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
    super(id, description, dateOnborn, gender, numberOfBones, cage);
  }

  feed(food) {
    throw new Error('Method "feed" is not supported yet.');
  }
}

module.exports = Tiger;
