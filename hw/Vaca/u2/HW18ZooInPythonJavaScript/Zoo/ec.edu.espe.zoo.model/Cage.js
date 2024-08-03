class Cage {
    constructor(id, type) {
        this.id = id;
        this.type = type;
    }

    toString() {
        return `Cage{id=${this.id}, type=${this.type}}`;
    }
}

module.exports = Cage;
