/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.MazeController;
import model.MazeGenerator;
import model.SimpleMazeGenerator;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class MazeSystem {
    public static void main(String[] args) {
        MazePrinter printer = new AsciiMazePrinter(); 
        MazeGenerator generator = new SimpleMazeGenerator();
        MazeController controller = new MazeController(5, 5, printer, generator);

        controller.generateMaze();
        controller.displayMaze();
    }
}
