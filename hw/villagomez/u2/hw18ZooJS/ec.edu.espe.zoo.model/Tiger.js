const Feline = require('./Feline');
const Cage = require('./Cage'); 

class Tiger extends Feline {

    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

    feed(food) {
        throw new Error('Not supported yet.');
    }
    
}

module.exports = Tiger;