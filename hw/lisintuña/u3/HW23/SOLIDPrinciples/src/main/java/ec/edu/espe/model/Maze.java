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
public class Maze {



    private List<Room> rooms;
    private Room entrance;
    private Room exit;
    private List<Door> doors;
    private int numberOfWalls;

    public Maze(List<Room> rooms, Room entrance, Room exit, List<Door> doors, int numberOfWalls) {
        this.rooms = rooms;
        this.entrance = entrance;
        this.exit = exit;
        this.doors = doors;
        this.numberOfWalls = numberOfWalls;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Room getEntrance() {
        return entrance;
    }

    public void setEntrance(Room entrance) {
        this.entrance = entrance;
    }

    public Room getExit() {
        return exit;
    }

    public void setExit(Room exit) {
        this.exit = exit;
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


