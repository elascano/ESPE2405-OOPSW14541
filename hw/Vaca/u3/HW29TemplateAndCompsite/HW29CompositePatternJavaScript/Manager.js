class Manager extends Supervisior {
    constructor(aName) {
        super();
        this.name = aName;
        this.title = "Manager";
    }

    stateName() {
        super.stateName();
    }
}
