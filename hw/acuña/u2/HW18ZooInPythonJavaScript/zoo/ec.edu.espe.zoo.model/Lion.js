const {Feline} = require('./Feline.js');

class Lion extends Feline {
    constructor(canRoar, id, name, birthDate, gender, numberOfLegs, cage) {
        super(id, name, birthDate, gender, numberOfLegs, cage);
        this.canRoar = canRoar;
    }

    register(cage) {
        this.cage = cage;
    }

    Feed(quantity) {
        console.log(`Feeding the lion with ${quantity} units of food.`);
    }

    feed(quantity, food) {
        console.log(`Feeding the lion with ${quantity} units of ${food.getName()}.`);
    }
}

module.exports = { Lion };
