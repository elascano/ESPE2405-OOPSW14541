class Clerk extends Employee {
    constructor(aName) {
        super();
        this.name = aName;
        this.title = "Clerk";
    }

    stateName() {
        super.stateName();
    }
}
