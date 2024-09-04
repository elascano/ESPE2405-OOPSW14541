/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class Maze {

    private int id;
    private int width;
    private int height;
    private SolutionPath solutionPath;
    private ArrayList<WrongPath> wrongPaths;
    private int numberOfRooms;

    public Maze() {
    }

    public Maze(int id, int width, int height, SolutionPath solutionPath, ArrayList<WrongPath> wrongPaths, int numberOfRooms) {
        this.id = id;
        this.width = width;
        this.height = height;
        this.solutionPath = solutionPath;
        this.wrongPaths = wrongPaths;
        this.numberOfRooms = numberOfRooms;
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
     * @return the solutionPath
     */
    public SolutionPath getSolutionPath() {
        return solutionPath;
    }

    /**
     * @param solutionPath the solutionPath to set
     */
    public void setSolutionPath(SolutionPath solutionPath) {
        this.solutionPath = solutionPath;
    }

    /**
     * @return the wrongPaths
     */
    public ArrayList<WrongPath> getWrongPaths() {
        return wrongPaths;
    }

    /**
     * @param wrongPaths the wrongPaths to set
     */
    public void setWrongPaths(ArrayList<WrongPath> wrongPaths) {
        this.wrongPaths = wrongPaths;
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

}
