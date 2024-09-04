/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.Maze;
import ec.edu.espe.view.MazeView;


public class MazeController {
    private Maze model;
    private MazeView view;

    public MazeController(Maze model, MazeView view) {
        this.model = model;
        this.view = view;
    }

    public void updateMaze(Maze newMaze) {
        this.model = newMaze;
        
    }

    public void showMessage(String message) {
        view.displayMessage(message);
    }
}

