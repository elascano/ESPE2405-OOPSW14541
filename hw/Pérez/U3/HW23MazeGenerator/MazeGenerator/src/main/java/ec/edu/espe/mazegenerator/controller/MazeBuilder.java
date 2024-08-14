/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.controller;

import ec.edu.espe.mazegenerator.model.Door;
import ec.edu.espe.mazegenerator.model.EntranceRoom;
import ec.edu.espe.mazegenerator.model.ExitRoom;
import ec.edu.espe.mazegenerator.model.Room;
import ec.edu.espe.mazegenerator.model.Wall;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class MazeBuilder {

    private MazeValidator validator;

    public MazeBuilder() {
        validator = new MazeValidator();
    }

    public Room[][] buildMaze(int width, int height) {
        Room[][] maze = new Room[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 && j == 0) {
                    maze[i][j] = new EntranceRoom();
                } else if (i == height - 1 && j == width - 1) {
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

        System.out.println("Creating maze with width " + width + " and height " + height);
        System.out.println("Total rooms: " + (width * height));
        int totalDoors = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                totalDoors += maze[i][j].getNumberOfDoors();
            }
        }
        System.out.println("Total doors: " + totalDoors);

        return maze;
    }
}
