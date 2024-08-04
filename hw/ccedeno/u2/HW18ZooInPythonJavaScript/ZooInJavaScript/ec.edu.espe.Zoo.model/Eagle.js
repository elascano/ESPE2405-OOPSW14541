const Bird = require('../ec.edu.espe.Zoo.model/Bird');

class Eagle extends Bird {
  constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
    super(id, description, dateOnborn, gender, numberOfBones, cage);
  }

  feed(food) {
    throw new Error('Method "feed" is not supported yet.');
  }
}

module.exports = Eagle;
