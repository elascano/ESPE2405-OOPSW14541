class Truck {
    constructor(id, model, year, color) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    toJSON() {
        return {
            id: this.id,
            model: this.model,
            year: this.year,
            color: this.color
        };
    }

    static fromJSON(json) {
        return new Truck(json.id, json.model, json.year, json.color);
    }
}

module.exports = Truck;
