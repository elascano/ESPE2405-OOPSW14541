import { Employee } from './Employee.js';

export class Clerk extends Employee {
    constructor(aName) {
        super();
        this.title = "Clerk";
        this.name = aName;
    }

    stateName() {
        super.stateName();
    }
}
