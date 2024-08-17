/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazeaplication.view;

import ec.edu.espe.mazeaplication.model.Maze;
import ec.edu.espe.mazeaplication.controller.*;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class MazeAplication {
    public static void main(String[] args) {
        MazeController mazeController = new MazeController();
        Maze maze = mazeController.generateMaze();
        mazeController.saveMazeAsImage(maze);
    }
}
