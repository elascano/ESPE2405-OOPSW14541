import { Supervisor } from './Supervisor.js';

export class President extends Supervisor {
    static president = null;

    constructor(aName) {
        super();
        this.title = "President";
        this.name = aName;
    }

    static getPresident(aName) {
        if (!President.president) {
            President.president = new President(aName);
        }
        return President.president;
    }

    stateName() {
        super.stateName();
    }
}
