class Chicken {
    constructor (id, name, color, age, molting, bornOnDate){
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
        this.bornOnDate = bornOnDate;
    }

    toString(){
        return `ID: ${this.id}, Name: ${this.name}, Color: ${this.color}, Age: ${this.age}, Molting: ${this.molting}, Born On: ${this.bornOnDate}`;
    }
}

module.exports = Chicken;