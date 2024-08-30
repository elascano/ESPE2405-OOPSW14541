/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class Door {
    protected Room currentRoom;
    protected Room attachedRoom;

    public Door(Room room1, Room room2) {
        this.currentRoom = room1;
        this.attachedRoom = room2;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getAttachedRoom() {
        return attachedRoom;
    }


    public void setAttachedRoom(Room attachedRoom) {
        this.attachedRoom = attachedRoom;
    }
    
}