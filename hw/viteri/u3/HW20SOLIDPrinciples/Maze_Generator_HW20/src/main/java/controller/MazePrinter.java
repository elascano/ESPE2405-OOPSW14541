/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Maze;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public interface MazePrinter {
    void printMazeInASCII(Maze maze);
    void printMazeInPNG(Maze maze);
}