/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.model;

/**
 *
 * @author Usuario
 */
public class Path {

    public Room start;
    public Room end;

    public Path(Room start, Room end) {
        this.start = start;
        this.end = end;
    }

    /**
     * @return the start
     */
    public Room getStart() {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(Room start) {
        this.start = start;
    }

    /**
     * @return the end
     */
    public Room getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(Room end) {
        this.end = end;
    }
}
