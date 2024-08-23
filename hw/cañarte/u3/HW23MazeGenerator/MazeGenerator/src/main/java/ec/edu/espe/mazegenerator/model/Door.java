/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.model;

/**
 *
 * @author Usuario
 */
public class Door {
    public final Room doorPosition;

    public Door(Room doorPosition) {
        this.doorPosition = doorPosition;
    }

    /**
     * @return the doorPosition
     */
    public Room getDoorPosition() {
        return doorPosition;
    }

}
