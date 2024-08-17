const {Primate} = require('./Primate.js');

class Monkey extends Primate {
    constructor(id, name, birthDate, gender, numberOfLegs, cage) {
        super(id, name, birthDate, gender, numberOfLegs, cage);
    }

    Feed(quantity) {
        console.log(`Feeding the monkey with ${quantity} units of food.`);
    }
}

module.exports = { Monkey };
