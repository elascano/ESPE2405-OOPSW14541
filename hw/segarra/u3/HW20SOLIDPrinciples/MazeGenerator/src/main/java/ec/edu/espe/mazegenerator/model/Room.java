/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.model;

import java.util.List;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class Room {
    protected List<Door> doors;
    protected int numberOfWalls;

    public Room(List<Door> doors, int numeroOfWalls) {
        this.doors = doors;
        this.numberOfWalls = numeroOfWalls;
    }

    /**
     * @return the doors
     */
    public List<Door> getDoors() {
        return doors;
    }

    /**
     * @param doors the doors to set
     */
    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    /**
     * @return the numberOfWalls
     */
    public int getNumberOfWalls() {
        return numberOfWalls;
    }

    /**
     * @param numberOfWalls the numberOfWalls to set
     */
    public void setNumberOfWalls(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }
    
    
}
