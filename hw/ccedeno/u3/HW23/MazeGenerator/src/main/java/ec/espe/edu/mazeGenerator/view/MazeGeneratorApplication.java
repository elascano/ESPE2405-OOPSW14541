/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.mazeGenerator.view;

import ec.espe.edu.mazeGenerator.controller.DoorController;
import ec.espe.edu.mazeGenerator.controller.MazeController;
import ec.espe.edu.mazeGenerator.controller.RoomController;
import ec.espe.edu.mazeGenerator.controller.WallController;
import ec.espe.edu.mazeGenerator.model.Door;
import ec.espe.edu.mazeGenerator.model.Maze;
import ec.espe.edu.mazeGenerator.model.Room;
import ec.espe.edu.mazeGenerator.model.Wall;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class MazeGeneratorApplication {
    public static void main(String[] args) {
        // Create a new maze
        Maze maze = new Maze(1, 10, 10, 5);

        // Create controllers
        MazeController mazeController = new MazeController(maze);
        RoomController roomController = new RoomController();
        DoorController doorController = new DoorController();
        WallController wallController = new WallController();

        // Example of generating rooms, adding doors and walls
        Door door1 = new Door(1, 'N');
        Room room1 = new Room(1, 4, door1);
        doorController.addDoor(room1, door1);
        Wall wall1 = new Wall(1, 'W');
        wallController.addWall(room1, wall1);

        mazeController.generateMaze();
        mazeController.saveMazeAsJson();

        System.out.println("Maze generated and saved as JSON.");
    }
    
}
