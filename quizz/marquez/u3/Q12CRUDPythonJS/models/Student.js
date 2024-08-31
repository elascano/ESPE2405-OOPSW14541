class Student {
    constructor(id, name, lastName, age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    toString() {
        return `Student{id=${this.id}, name=${this.name}, lastName=${this.lastName}, age=${this.age}}`;
    }
}

module.exports = Student;