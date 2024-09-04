import { Employee } from './Employee.js';

export class Teller extends Employee {
    constructor(aName) {
        super();
        this.title = "Teller";
        this.name = aName;
    }

    stateName() {
        super.stateName();
    }
}
