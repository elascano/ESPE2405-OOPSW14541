/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.view;

import ec.edu.espe.mazegenerator.controller.MazeController;
import ec.edu.espe.mazegenerator.controller.RoomController;
import ec.edu.espe.mazegenerator.model.Maze;
import ec.edu.espe.mazegenerator.model.MazeGenerator;

/**
 *
 * @author Usuario
 */
public class MazeView {
    
    public static void main(String[] args) {
        Maze simpleMaze = new MazeGenerator();
        MazeGenerated view= new MazeGenerated();
        RoomController roomController = new RoomController(simpleMaze);
        MazeController controller = new MazeController(simpleMaze, view, roomController);
        controller.printMaze();
        controller.updateView();
    }


}
