/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.controller;

import ec.edu.espe.mazegenerator.model.*;
import ec.edu.espe.mazegenerator.view.MazeGenerated;
import java.util.Random;


/**
 *
 * @author Usuario
 */
public class RoomController {
    private final Maze model;
    
    public RoomController(Maze model) {
        this.model = model;
    }
    
    void validateRooms() {
        Room[][] rooms = model.getRooms();
        for (int i = 0; i < model.getWidth(); i++) {
            for (int j = 0; j < model.getHeight(); j++) {
                Room room = rooms[i][j];
                boolean hasDoor = room.getWalls().stream().anyMatch(Wall::hasDoor);
                if (!hasDoor) {
                    System.out.println("ERROR: Room (" + i + ", " + j + ") doesn't have any doors");
                }
            }
        }
    }
    void connectRooms() {
        Room[][] rooms = model.getRooms();
        for (int i = 0; i < model.getWidth(); i++) {
            for (int j = 0; j < model.getHeight(); j++) {
                Room currentRoom = rooms[i][j];
                if (i > 0) {
                    createDoor(currentRoom, rooms[i-1][j], 3, 1);  
                }
                if (j > 0) {
                    createDoor(currentRoom, rooms[i][j-1], 0, 2);  
                }
            }
        }
    }
    private void createDoor(Room room1, Room room2, int wallIndexRoom1, int wallIndexRoom2) {
        room1.getWalls().get(wallIndexRoom1).setHasDoor(true);
        room2.getWalls().get(wallIndexRoom2).setHasDoor(true);
    }
}
