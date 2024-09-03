/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jenniffer Marquez, Javasquad, DCCO-ESPE
 */
public class Room {
    private int x, y;
    private List<Door> doors;

    public Room(int x, int y) {
        this.x = x;
        this.y = y;
        this.doors = new ArrayList<>();
    }

    public void addDoor(Door door) {
        getDoors().add(door);
        System.out.println("adding door...");
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
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
    
    
}
