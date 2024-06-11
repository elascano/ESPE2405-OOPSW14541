export class Chicken {
    constructor(id, name, color, age, molting, bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
        this.bornOnDate = bornOnDate;
    }


    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getName() {
        return this.name;
    }

    setName(name) {
        this.name = name;
    }

    getColor() {
        return this.color;
    }

    setColor(color) {
        this.color = color;
    }

    getAge() {
        return this.age;
    }

    setAge(age) {
        this.age = age;
    }

    isMolting() {
        return this.molting;
    }

    setMolting(molting) {
        this.molting = molting;
    }

    getBornOnDate() {
        return this.bornOnDate;
    }

    setBornOnDate(bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    toString() {
        return `Chicken{id=${this.id}, name=${this.name}, color=${this.color}, age=${this.age}, molting=${this.molting}, bornOnDate=${this.bornOnDate.toISOString().split('T')[0]}}`;
    }
}