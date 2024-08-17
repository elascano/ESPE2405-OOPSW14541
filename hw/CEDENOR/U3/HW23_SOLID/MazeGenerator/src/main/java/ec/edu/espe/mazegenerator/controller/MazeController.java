/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.controller;

import ec.edu.espe.mazegenerator.model.Maze;
import ec.edu.espe.mazegenerator.model.MazeGenerator;
import ec.edu.espe.mazegenerator.view.MazeView;

/**
 *
* @author Nahomi Cedeño, CodeCreators, DCCO-ESPE
 */
public class MazeController {
    private Maze model;
    private MazeView view;

    public MazeController(MazeView view) {
        this.view = view;
    }

    public void createMaze(int N, int M) {
        MazeGenerator generator = new MazeGenerator();
        model = generator.createMaze(N, M);
    }

    public void renderMaze() {
        view.displayMaze(model);
    }
}
