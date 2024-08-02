class Food {

    constructor(id, description){
        this._id = id;
        this._description = description;
    }

    toString() {
        return `Food{id=${this._id}, description=${this._description}}`;
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

}

module.exports = Food;