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
public class WrongPath extends Path {

    public Room endPath;

    public WrongPath(int id, ArrayList<Room> rooms, Door startDoor, Room endPath) {
        super(id, rooms, startDoor);
        this.endPath = endPath;
    }

    /**
     * @return the endPath
     */
    public Room getEndPath() {
        return endPath;
    }

    /**
     * @param endPath the endPath to set
     */
    public void setEndPath(Room endPath) {
        this.endPath = endPath;
    }

}
