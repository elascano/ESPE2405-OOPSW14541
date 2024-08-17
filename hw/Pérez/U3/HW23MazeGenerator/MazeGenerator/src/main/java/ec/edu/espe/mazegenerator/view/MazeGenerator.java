/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espe.mazegenerator.view;

import ec.edu.espe.mazegenerator.controller.MazeBuilder;
import ec.edu.espe.mazegenerator.model.Room;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class MazeGenerator {

    public static void main(String[] args) {
        int width = 2; 
        int height = 2; 

        MazeBuilder builder = new MazeBuilder();
        Room[][] maze = builder.buildMaze(width, height);
    }
}

