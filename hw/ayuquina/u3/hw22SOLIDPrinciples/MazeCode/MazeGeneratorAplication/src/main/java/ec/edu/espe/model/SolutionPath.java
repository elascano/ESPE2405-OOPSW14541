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
public class SolutionPath extends Path{
    
    public Door endDoor;

    public SolutionPath(int id, ArrayList<Room> rooms, Door startDoor, Door endDoor) {
        super(id, rooms, startDoor);
        this.endDoor = endDoor;
    }

    /**
     * @return the endDoor
     */
    public Door getEndDoor() {
        return endDoor;
    }

    /**
     * @param endDoor the endDoor to set
     */
    public void setEndDoor(Door endDoor) {
        this.endDoor = endDoor;
    }
}
