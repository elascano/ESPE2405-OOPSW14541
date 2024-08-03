const {Fish} = require( './Fish.js');

class Shark extends Fish {
    constructor(id, name, birthDate, gender, numberOfLegs, cage) {
        super(id, name, birthDate, gender, numberOfLegs, cage);
    }

    Feed(quantity) {
        console.log(`Feeding the shark with ${quantity} units of food.`);
    }
}

module.exports = { Shark };
