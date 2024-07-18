const Feline = require('./Feline'); 
const Cage = require('./Cage'); 


class Lion extends Feline {

    constructor(mane, id, description, bornOnDate, gender, numberOfBones, cage){
        super(id, description, bornOnDate, gender, numberOfBones, cage);
        this._mane = mane;
    }

    toString() {
        return `Lion{mane=${this._mane}, ${super.toString()}}`;
    }

    feed(food) {
        console.log(`Feeding a Lion with ${food} rats`);
    }

    feedQuantity(quantity, food) {
        console.log(`Feeding the lion with ${quantity} ${food}(s)`);
        console.log(`Number of legs ${this.numberOfLegs}`);
    }

    get mane() {
        return this._mane;
    }

    set mane(mane) {
        this._mane = mane;
    }

}

module.exports = Lion;