const Bird = require('../ec.edu.espe.Zoo.model/Bird');

class Condor extends Bird {
  constructor(mountains, id, description, dateOnborn, gender, numberOfBones, cage) {
    super(id, description, dateOnborn, gender, numberOfBones, cage);
    this.mountains = mountains;
  }

  toString() {
    return `Condor{mountains=${this.mountains}, ${super.toString()}}`;
  }

  feed(food) {
    throw new Error('Method "feed" is not supported yet.');
  }

  // Getters and Setters
  getMountains() {
    return this.mountains;
  }

  setMountains(mountains) {
    this.mountains = mountains;
  }
}

module.exports = Condor;
