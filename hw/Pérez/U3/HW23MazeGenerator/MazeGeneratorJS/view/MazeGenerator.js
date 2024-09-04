import { MazeBuilder } from '../controller/MazeBuilder.js';

const main = () => {
    const width = 2;
    const height = 2;

    const builder = new MazeBuilder();
    const maze = builder.buildMaze(width, height);
};

main();
