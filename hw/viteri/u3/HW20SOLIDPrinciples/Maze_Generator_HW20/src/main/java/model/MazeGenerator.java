/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.MazePrinter;

/**
 *
 * @author Alexis Viteri DCO-ESPE
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


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    public Maze getMaze() {
        return maze;
    }


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
