class Cage {
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }

    getId() {
        return this.id;
    }

    getName() {
        return this.name;
    }

    setId(id) {
        this.id = id;
    }

    setName(name) {
        this.name = name;
    }
}

module.exports = { Cage };