export class Wall {
    constructor() {
        this.hasDoor = false;
    }

    setDoor(hasDoor) {
        this.hasDoor = hasDoor;
    }

    hasDoor() {
        return this.hasDoor;
    }
}
