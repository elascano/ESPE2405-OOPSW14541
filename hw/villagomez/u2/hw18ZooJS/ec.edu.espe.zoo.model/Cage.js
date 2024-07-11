class Cage {

    constructor(id, type){
        this._id = id;
        this._type = type;
    }

    toString() {
        return `Cage{id=${this._id}, type=${this._type}}`;
    }

    get id() {
        return this._id;
    }

    set id(id) {
        this._id = id;
    }

    get type() {
        return this._type;
    }

    set type(type) {
        this._type = type;
    }

}

module.exports = Cage;