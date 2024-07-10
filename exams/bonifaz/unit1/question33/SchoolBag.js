class SchoolBag {
    constructor(id, brand, color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    toString() {
        return `SchoolBag{id=${this.id}, brand=${this.brand}, color=${this.color}}`;
    }

    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getBrand() {
        return this.brand;
    }

    setBrand(brand) {
        this.brand = brand;
    }

    getColor() {
        return this.color;
    }

    setColor(color) {
        this.color = color;
    }
}

module.exports = SchoolBag;