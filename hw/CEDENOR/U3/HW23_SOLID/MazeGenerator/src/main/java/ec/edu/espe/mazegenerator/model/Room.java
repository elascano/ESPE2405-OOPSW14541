/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
* @author Nahomi Cedeño, CodeCreators, DCCO-ESPE
 */
public class Room {
    private List<Door> doors;

    public Room() {
        doors = new ArrayList<>();
    }

    public void addDoor(Room adjacentRoom) {
        Door door = new Door(adjacentRoom);
        doors.add(door);
    }

    public List<Door> getDoors() {
        return doors;
    }

    public void openDoor(int index) {
        if (index >= 0 && index < doors.size()) {
            doors.get(index).toggle();
        }
    }
}
