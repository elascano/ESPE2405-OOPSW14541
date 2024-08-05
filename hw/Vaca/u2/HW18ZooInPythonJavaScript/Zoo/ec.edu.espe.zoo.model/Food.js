class Food {
    constructor(id, description) {
        this.id = id;
        this.description = description;
    }

    toString() {
        return `Food{id=${this.id}, description=${this.description}}`;
    }
}

module.exports = Food;
