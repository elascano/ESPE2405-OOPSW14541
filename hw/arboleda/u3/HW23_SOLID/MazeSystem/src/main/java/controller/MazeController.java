/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Maze;
import model.MazeGenerator;
import view.MazePrinter;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class MazeController {
    private Maze maze;
    private MazePrinter printer;
    private MazeGenerator generator;

    public MazeController(int width, int height, MazePrinter printer, MazeGenerator generator) {
        this.maze = new Maze(width, height);
        this.printer = printer;
        this.generator = generator;
    }

    public void generateMaze() {
        getGenerator().generate(getMaze().getRooms());
        System.out.println("genereting maze...");
    }

    public void displayMaze() {
        getPrinter().print(getMaze());
        System.out.println("displaing maze...");
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

    /**
     * @return the printer
     */
    public MazePrinter getPrinter() {
        return printer;
    }

    /**
     * @param printer the printer to set
     */
    public void setPrinter(MazePrinter printer) {
        this.printer = printer;
    }

    /**
     * @return the generator
     */
    public MazeGenerator getGenerator() {
        return generator;
    }

    /**
     * @param generator the generator to set
     */
    public void setGenerator(MazeGenerator generator) {
        this.generator = generator;
    }
    
}
