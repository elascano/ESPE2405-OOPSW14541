/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public abstract class Room {
    private List<Door> doors;
    private Wall[] walls; 

    public Room() {
        doors = new ArrayList<>();
        walls = new Wall[4]; 
        for (int i = 0; i < 4; i++) {
            walls[i] = new Wall();
        }
    }

    public void addDoor(Door door, int wallIndex) {
        doors.add(door);
        if (wallIndex >= 0 && wallIndex < walls.length) {
            walls[wallIndex].setDoor(true); 
        }
    }

    public List<Door> getDoors() {
        return doors;
    }

    public Wall[] getWalls() {
        return walls;
    }

    public int getNumberOfDoors() {
        return doors.size();
    }

    public abstract String getRoomType();
}
