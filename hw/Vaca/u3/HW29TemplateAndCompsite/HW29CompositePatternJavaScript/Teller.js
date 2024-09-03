class Teller extends Employee {
    constructor(aName) {
        super();
        this.name = aName;
        this.title = "Teller";
    }

    stateName() {
        super.stateName();
    }
}
