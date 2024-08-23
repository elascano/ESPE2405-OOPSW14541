/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.mazeGenerator.model;

import java.util.ArrayList;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class Room {
    private int id;
    private int numberOfWalls;
    private ArrayList<Wall> walls;
    private Door door;

    public Room(int id, int numberOfWalls, Door door) {
        this.id = id;
        this.numberOfWalls = numberOfWalls;
        this.door = door;
        this.walls = new ArrayList<>();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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

    /**
     * @return the walls
     */
    public ArrayList<Wall> getWalls() {
        return walls;
    }

    /**
     * @param walls the walls to set
     */
    public void setWalls(ArrayList<Wall> walls) {
        this.walls = walls;
    }

    /**
     * @return the door
     */
    public Door getDoor() {
        return door;
    }

    /**
     * @param door the door to set
     */
    public void setDoor(Door door) {
        this.door = door;
    }
    
}
