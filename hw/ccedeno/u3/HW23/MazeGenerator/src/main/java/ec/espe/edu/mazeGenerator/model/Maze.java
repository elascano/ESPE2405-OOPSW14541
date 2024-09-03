/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.mazeGenerator.model;

import java.util.ArrayList;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class Maze {
    private int id;
    private int width;
    private int height;
    private int numberOfRooms;
    private ArrayList<Path> paths;

    public Maze(int id, int width, int height, int numberOfRooms) {
        this.id = id;
        this.width = width;
        this.height = height;
        this.numberOfRooms = numberOfRooms;
        this.paths = new ArrayList<>();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

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
     * @return the numberOfRooms
     */
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * @param numberOfRooms the numberOfRooms to set
     */
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    /**
     * @return the paths
     */
    public ArrayList<Path> getPaths() {
        return paths;
    }

    /**
     * @param paths the paths to set
     */
    public void setPaths(ArrayList<Path> paths) {
        this.paths = paths;
    }
    
}
