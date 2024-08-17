/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.model;

import ec.edu.espe.mazegenerator.controller.MazePrinter;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class MazeGenerator implements MazePrinter{
    protected int width;
    protected int height;
    protected Maze maze;

    public MazeGenerator(int width, int height, Maze maze) {
        this.width = width;
        this.height = height;
        this.maze = maze;
    }

    @Override
    public void printMazeInASCII(Maze maze) {
        System.out.println("Printing the maze in ASCII format.");
    }

    @Override
    public void printMazeInPNG(Maze maze) {
        System.out.println("Printing the maze in png format.");
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
     * @return the maze
     */
    public Maze getMaze() {
        return maze;
    }

    /**
     * @param maze the maze to set
     */
    public void setMaze(Maze maze) {
        this.maze = maze;
    }
    
    public void generateAMaze(int typeOfPrintForTheMaze){
        if(typeOfPrintForTheMaze == 1){
            boolean pathFinder = PathFinder.hasUniquePath(maze);
            printMazeInASCII(maze);
        }else{
            boolean pathFinder = PathFinder.hasUniquePath(maze);
            printMazeInPNG(maze);
        }
    }
}
