export class Food {
    constructor(id, description) {
        this.id = id;
        this.description = description;
    }

    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getDescription() {
        return this.description;
    }

    setDescription(description) {
        this.description = description;
    }

    toString() {
        return `Food{id=${this.id}, description=${this.description}}`;
    }
}

