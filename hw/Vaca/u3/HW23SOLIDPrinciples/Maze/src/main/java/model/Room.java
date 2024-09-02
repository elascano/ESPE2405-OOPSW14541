
package model;

/**
 *
 * @author MSI-PULSE
 */
public class Room {
    private Position position;
    private boolean hasTopWall;
    private boolean hasRightWall;
    private boolean hasBottomWall;
    private boolean hasLeftWall;

    public Room(Position position) {
        this.position = position;
        this.hasTopWall = true;
        this.hasRightWall = true;
        this.hasBottomWall = true;
        this.hasLeftWall = true;
    }

    public Position getPosition() {
        return position;
    }

    public boolean hasTopWall() {
        return hasTopWall;
    }

    public boolean hasRightWall() {
        return hasRightWall;
    }

    public boolean hasBottomWall() {
        return hasBottomWall;
    }

    public boolean hasLeftWall() {
        return hasLeftWall;
    }

    public void removeTopWall() {
        this.hasTopWall = false;
    }

    public void removeRightWall() {
        this.hasRightWall = false;
    }

    public void removeBottomWall() {
        this.hasBottomWall = false;
    }

    public void removeLeftWall() {
        this.hasLeftWall = false;
    }
}

