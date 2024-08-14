/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.hw23_solid.controller;

import ec.edu.espe.hw23_solid.model.IMazeGenerator;
import ec.edu.espe.hw23_solid.model.MazeGenerator;
import ec.edu.espe.hw23_solid.view.IMazePrinter;
import ec.edu.espe.hw23_solid.view.MazePrinter;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class MazeController implements IMazeController {
    private IMazeGenerator generator;
    private IMazePrinter printer;

    public MazeController() {
        this.generator = new MazeGenerator();
        this.printer = new MazePrinter();
    }

    @Override
    public void createAndDisplayMaze(int width, int height) {
        var maze = generator.generateMaze(width, height);
        printer.printMaze(maze);
    }
}