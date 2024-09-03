export class Door {
    constructor(leadsTo) {
        this.leadsTo = leadsTo;
    }

    getLeadsTo() {
        return this.leadsTo;
    }

    setLeadsTo(leadsTo) {
        this.leadsTo = leadsTo;
    }
}
