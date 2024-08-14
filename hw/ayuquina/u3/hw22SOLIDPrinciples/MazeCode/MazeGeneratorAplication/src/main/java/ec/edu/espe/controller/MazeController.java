/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.Maze;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class MazeController {
    public static Maze generateMaze(){
        System.out.println("Generating Maze...");
        Maze maze = new Maze();
        return maze ;
    }
    
    public static void saveMazeAsAscii(){
        System.out.println("Save Maze in ASCII form.");
    }
    
    public static void saveMazeAsImage(){
        System.out.println("Save Maze in Image form.");
    }
}
