import { Supervisor } from './Supervisor.js';

export class Manager extends Supervisor {
    constructor(aName) {
        super();
        this.title = "Manager";
        this.name = aName;
    }

    stateName() {
        super.stateName();
    }
}
