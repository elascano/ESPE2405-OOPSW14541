class Supervisor extends Employee {
    constructor() {
        super();
        this.subordinates = [];
    }

    add(employee) {
        this.subordinates.push(employee);
    }

    remove(employee) {
        const index = this.subordinates.indexOf(employee);
        if (index !== -1) {
            this.subordinates.splice(index, 1);
        }
    }

    stateName() {
        return "Supervisor";
    }

    getSubordinates() {
        return this.subordinates;
    }

    stateNamesOfSubordinates() {
        return this.subordinates.map(employee => employee.stateName());
    }
}
