/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class Room {
   protected List<Door> doors;
    protected int numberOfWalls;

    public Room(List<Door> doors, int numeroOfWalls) {
        this.doors = doors;
        this.numberOfWalls = numeroOfWalls;
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
