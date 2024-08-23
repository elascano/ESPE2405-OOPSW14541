
package ec.edu.espe.mazegenerator.controller;

import ec.edu.espe.mazegenerator.model.Maze;
import ec.edu.espe.mazegenerator.model.Room;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public interface RoomActions {
    void adjacentRooms(Maze maze, Room currentRoom);
}
