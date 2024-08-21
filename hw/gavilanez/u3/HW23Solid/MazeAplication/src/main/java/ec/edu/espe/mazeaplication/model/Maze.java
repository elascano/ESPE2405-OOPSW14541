/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazeaplication.model;

import java.util.ArrayList;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class Maze {
    private int width;
    private int height;
    private int numberOfRoom;
    private DeterminePath determinePath;
    private ArrayList<Room> rooms;

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the numberOfRoom
     */
    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    /**
     * @param numberOfRoom the numberOfRoom to set
     */
    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    /**
     * @return the determinePath
     */
    public DeterminePath getDeterminePath() {
        return determinePath;
    }

    /**
     * @param determinePath the determinePath to set
     */
    public void setDeterminePath(DeterminePath determinePath) {
        this.determinePath = determinePath;
    }

    /**
     * @return the rooms
     */
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    /**
     * @param rooms the rooms to set
     */
    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    
}
