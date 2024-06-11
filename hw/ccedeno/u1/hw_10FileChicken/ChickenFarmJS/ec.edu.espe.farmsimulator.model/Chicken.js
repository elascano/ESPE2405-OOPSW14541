class Chicken {
    constructor(id, name, color, molting, year, month, day) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.molting = molting;
        this.bornOnYear = year;
        this.bornOnMonth = month;
        this.bornOnDay = day;
    }

    // Getters and Setters
    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getColor() {
        return this.color;
    }

    setColor(color) {
        this.color = color;
    }

    getName() {
        return this.name;
    }

    setName(name) {
        this.name = name;
    }

    isMolting() {
        return this.molting;
    }

    setMolting(molting) {
        this.molting = molting;
    }

    getBornOnYear() {
        return this.bornOnYear;
    }

    setBornOnYear(year) {
        this.bornOnYear = year;
    }

    getBornOnMonth() {
        return this.bornOnMonth;
    }

    setBornOnMonth(month) {
        this.bornOnMonth = month;
    }

    getBornOnDay() {
        return this.bornOnDay;
    }

    setBornOnDay(day) {
        this.bornOnDay = day;
    }

    toString() {
        return `Chicken{id=${this.getId()}, name=${this.getName()}, color=${this.getColor()}, molting=${this.isMolting()}, Age: ${this.getBornOnYear()} years, ${this.getBornOnMonth()} months and ${this.getBornOnDay()} days}`;
    }

    toStringType(type) {
        if (type === 1) {
            return `${this.id}, ${this.name}, ${this.color}, ${this.molting}, ${this.bornOnYear}, ${this.bornOnMonth}, ${this.bornOnDay}`;
        }
        return '';
    }
}

module.exports = Chicken;
