import { EntranceRoom } from '../model/EntranceRoom.js';
import { ExitRoom } from '../model/ExitRoom.js';
import { Room } from '../model/Room.js';
import { Door } from '../model/Door.js';
import { MazeValidator } from './MazeValidator.js';

export class MazeBuilder {
    constructor() {
        this.validator = new MazeValidator();
    }

    buildMaze(width, height) {
        let maze = Array.from({ length: height }, () => Array(width).fill(null));

        for (let i = 0; i < height; i++) {
            for (let j = 0; j < width; j++) {
                if (i === 0 && j === 0) {
                    maze[i][j] = new EntranceRoom();
                } else if (i === height - 1 && j === width - 1) {
                    maze[i][j] = new ExitRoom();
                } else {
                    maze[i][j] = new EntranceRoom();
                }

                if (j < width - 1) {
                    maze[i][j].addDoor(new Door(maze[i][j + 1]), 1);
                }
                if (i < height - 1) {
                    maze[i][j].addDoor(new Door(maze[i + 1][j]), 2);
                }
            }
        }

        console.log(`Creating maze with width ${width} and height ${height}`);
        console.log(`Total rooms: ${width * height}`);
        let totalDoors = 0;
        for (let i = 0; i < height; i++) {
            for (let j = 0; j < width; j++) {
                totalDoors += maze[i][j].getNumberOfDoors();
            }
        }
        console.log(`Total doors: ${totalDoors}`);

        return maze;
    }
}
