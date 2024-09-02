
package model;

/**
 *
 * @author MSI-PULSE
 */
public class Maze {
    private Room[][] rooms;
    private Position entrance;
    private Position exit;

    public Maze(int width, int height) {
        rooms = new Room[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                rooms[i][j] = new Room(new Position(i, j));
            }
        }
    }

    public Room getRoom(int x, int y) {
        return rooms[x][y];
    }

    public void setEntrance(Position entrance) {
        this.entrance = entrance;
    }

    public void setExit(Position exit) {
        this.exit = exit;
    }

    public Position getEntrance() {
        return entrance;
    }

    public Position getExit() {
        return exit;
    }
}

