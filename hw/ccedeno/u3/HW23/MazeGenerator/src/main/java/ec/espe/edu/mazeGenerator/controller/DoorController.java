/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.mazeGenerator.controller;

import ec.espe.edu.mazeGenerator.model.Door;
import ec.espe.edu.mazeGenerator.model.Room;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class DoorController {
    public void addDoor(Room room, Door door) {
        room.setDoor(door);
    }
}
