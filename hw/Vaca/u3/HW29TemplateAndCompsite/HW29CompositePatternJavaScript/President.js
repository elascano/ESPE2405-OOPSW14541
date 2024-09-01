class President extends Supervisior {
    static president = new President();

    constructor(aName) {
        super();
        this.name = aName || "Not assigned yet";
        this.title = "President";
    }

    stateName() {
        super.stateName();
    }

    static getPresident(aName) {
        President.president.name = aName;
        return President.president;
    }
}
