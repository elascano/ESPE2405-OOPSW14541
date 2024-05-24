class Chicken {
    constructor(id, name, color, age, molting, bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
        this.bornOnDate = new Date(bornOnDate);
    }

    
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
        this.bornOnDate = new Date(bornOnDate);
    }

    toString() {
        return `Chicken{id=${this.id}, name=${this.name}, color=${this.color}, age=${this.age}, molting=${this.molting}, bornOnDate=${this.bornOnDate.toISOString().split('T')[0]}}`;
    }
}

function promptUserForChickenData() {
    const id = parseInt(prompt("Enter chicken ID:"));
    const name = prompt("Enter chicken name:");
    const color = prompt("Enter chicken color:");
    const age = parseInt(prompt("Enter chicken age:"));
    const molting = prompt("Is the chicken molting? (true/false):").toLowerCase() === 'true';
    const bornOnDate = prompt("Enter chicken born on date (yyyy-mm-dd):");

    return new Chicken(id, name, color, age, molting, bornOnDate);
}


const chicken = promptUserForChickenData();
console.log(chicken.toString());
