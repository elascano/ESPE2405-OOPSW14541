class Animal {

    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        this._id = id;
        this._description = description;
        this._dateOnborn = dateOnborn;
        this._gender = gender;
        this._numberOfBones = numberOfBones;
        this._cage = cage;
        this.numberOfLegs = 0;
    }

    toString() {
        return `Animal{id=${this._id}, description=${this._description}, dateOnborn=${this._dateOnborn}, gender=${this._gender}, numberOfBones=${this._numberOfBones}, cage=${this._cage}}`;
    }

    feed(food) {
        throw new Error('You have to implement the method feed!');
    }

    register(cage) {
        console.log(`Register the animal ---> ${this.constructor.name} in cage ${cage}`);
    }

    get id() {
        return this._id;
    }

    set id(id) {
        this._id = id;
    }

    get description() {
        return this._description;
    }

    set description(description) {
        this._description = description;
    }

    get dateOnborn() {
        return this._dateOnborn;
    }

    set dateOnborn(dateOnborn) {
        this._dateOnborn = dateOnborn;
    }

    get gender() {
        return this._gender;
    }

    set gender(gender) {
        this._gender = gender;
    }

    get numberOfBones() {
        return this._numberOfBones;
    }

    set numberOfBones(numberOfBones) {
        this._numberOfBones = numberOfBones;
    }

    get cage() {
        return this._cage;
    }

    set cage(cage) {
        this._cage = cage;
    }
    
}

module.exports = Animal;