/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public abstract class Path {
    public int id;
    public ArrayList<Room> rooms;
    public Door startDoor;

    public Path(int id, ArrayList<Room> rooms, Door startDoor) {
        this.id = id;
        this.rooms = rooms;
        this.startDoor = startDoor;
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
     * @return the rooms
     */
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    /**
     * @param rooms the rooms to set
     */
    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    /**
     * @return the startDoor
     */
    public Door getStartDoor() {
        return startDoor;
    }

    /**
     * @param startDoor the startDoor to set
     */
    public void setStartDoor(Door startDoor) {
        this.startDoor = startDoor;
    }
}
