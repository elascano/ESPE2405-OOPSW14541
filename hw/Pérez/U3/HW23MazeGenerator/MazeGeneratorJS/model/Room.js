import { Door } from './Door.js';
import { Wall } from './Wall.js';

export class Room {
    constructor() {
        this.doors = [];
        this.walls = Array.from({ length: 4 }, () => new Wall());
    }

    addDoor(door, wallIndex) {
        this.doors.push(door);
        if (wallIndex >= 0 && wallIndex < this.walls.length) {
            this.walls[wallIndex].setDoor(true);
        }
    }

    getDoors() {
        return this.doors;
    }

    getWalls() {
        return this.walls;
    }

    getNumberOfDoors() {
        return this.doors.length;
    }

    getRoomType() {
        throw new Error("This method should be overridden by subclasses");
    }
}
