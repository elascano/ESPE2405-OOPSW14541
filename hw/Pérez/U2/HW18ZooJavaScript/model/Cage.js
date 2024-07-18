export class Cage {
    constructor(id, type) {
        this.id = id;
        this.type = type;
    }

    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getType() {
        return this.type;
    }

    setType(type) {
        this.type = type;
    }

    toString() {
        return `Cage{id=${this.id}, type=${this.type}}`;
    }
}

