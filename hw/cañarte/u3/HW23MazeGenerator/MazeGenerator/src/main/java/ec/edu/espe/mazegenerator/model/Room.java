package ec.edu.espe.mazegenerator.model;

import java.util.ArrayList;
import java.util.List;

public class Room {
    public List<Wall> walls;
    public boolean Entrance;
    public boolean Exit;

    public Room() {
        this.walls = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            this.walls.add(new Wall());
        }
        this.Entrance = false; 
        this.Exit = false;     
    }

    /**
     * @return the walls
     */
    public List<Wall> getWalls() {
        return walls;
    }

    /**
     * @param walls the walls to set
     */
    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    /**
     * @return the Entrance
     */
    public boolean isEntrance() {
        return Entrance;
    }

    /**
     * @param Entrance the Entrance to set
     */
    public void setEntrance(boolean Entrance) {
        this.Entrance = Entrance;
    }

    /**
     * @return the Exit
     */
    public boolean isExit() {
        return Exit;
    }

    /**
     * @param Exit the Exit to set
     */
    public void setExit(boolean Exit) {
        this.Exit = Exit;
    }


}
