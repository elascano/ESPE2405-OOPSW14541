/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import java.util.List;

/**
 *
 * @author DELL
 */
public class Room {
    private List<Door> doors;
    private int numberOfWalls;

    public Room(List<Door> doors, int numberOfWalls) {
        this.doors = doors;
        this.numberOfWalls = numberOfWalls;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    public int getNumberOfWalls() {
        return numberOfWalls;
    }

    public void setNumberOfWalls(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }
}
