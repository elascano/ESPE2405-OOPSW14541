/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Jenniffer Marquez, Javasquad, DCCO-ESPE
 */
public class Door {
    private Room room1, room2;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    /**
     * @return the room1
     */
    public Room getRoom1() {
        return room1;
    }

    /**
     * @param room1 the room1 to set
     */
    public void setRoom1(Room room1) {
        this.room1 = room1;
    }

    /**
     * @return the room2
     */
    public Room getRoom2() {
        return room2;
    }

    /**
     * @param room2 the room2 to set
     */
    public void setRoom2(Room room2) {
        this.room2 = room2;
    }
    
    
}
