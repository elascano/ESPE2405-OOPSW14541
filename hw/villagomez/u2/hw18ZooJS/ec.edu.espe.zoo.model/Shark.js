const Fish = require('./Fish');
const Cage = require('./Cage'); 

class Shark extends Fish {

    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

    feed(food) {
        console.log("Feeding to Shark");
    }
    
}

module.exports = Shark; 