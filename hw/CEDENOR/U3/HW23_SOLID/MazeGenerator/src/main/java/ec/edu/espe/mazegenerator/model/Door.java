/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.model;

/**
 *
 * @author Nahomi Cedeño, CodeCreators, DCCO-ESPE
 */
public class Door {
    private boolean isOpen;
    private Room adjacentRoom;

    public Door(Room adjacentRoom) {
        this.isOpen = false; 
        this.adjacentRoom = adjacentRoom;
    }

    public void toggle() {
        isOpen = !isOpen; 
    }

    public boolean isOpen() {
        return isOpen;
    }

    public Room getAdjacentRoom() {
        return adjacentRoom;
    }
}
