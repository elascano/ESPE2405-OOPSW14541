class Student {
    constructor(id, name, male, siblings) {
        this.id = id;
        this.name = name;
        this.male = male;
        this.siblings = siblings;
    }
    
    getId() {
        return this.id;
    }

    getName() {
        return this.name;
    }

    isMale() {
        return this.male;
    }

    getSiblings() {
        return this.siblings;
    }

    
    toString() {
        return `ID: ${this.id}, Name: ${this.name}, Gender: ${this.male ? 'Male' : 'Female'}, Siblings: ${this.siblings}`;
    }
}

module.exports = Student;
