/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.model;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class Door {
    protected Room currentRoom;
    protected Room attachedRoom;

    public Door(Room room1, Room room2) {
        this.currentRoom = room1;
        this.attachedRoom = room2;
    }

    /**
     * @return the currentRoom
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }

    /**
     * @param currentRoom the currentRoom to set
     */
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    /**
     * @return the attachedRoom
     */
    public Room getAttachedRoom() {
        return attachedRoom;
    }

    /**
     * @param attachedRoom the attachedRoom to set
     */
    public void setAttachedRoom(Room attachedRoom) {
        this.attachedRoom = attachedRoom;
    }
    
}
