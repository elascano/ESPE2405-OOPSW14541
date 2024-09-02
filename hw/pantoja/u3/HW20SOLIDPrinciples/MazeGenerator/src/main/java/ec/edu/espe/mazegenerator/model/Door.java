
package ec.edu.espe.mazegenerator.model;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
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
