class Supervisior extends Employee {
    constructor() {
        super();
        this.directReports = [];
    }

    stateName() {
        super.stateName();
        if (this.directReports.length > 0) {
            this.directReports.forEach(employee => employee.stateName());
        }
    }

    add(anEmployee) {
        this.directReports.push(anEmployee);
    }
}
