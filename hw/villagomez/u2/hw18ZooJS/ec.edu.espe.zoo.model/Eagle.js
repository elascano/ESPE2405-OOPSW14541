const Bird = require('./Bird');
const Cage = require('./Cage'); 

class Eagle extends Bird {

    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

    feed(food) {
        throw new Error('Not supported yet.');
    }
    
}

module.exports = Eagle;