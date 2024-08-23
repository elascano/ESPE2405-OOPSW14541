
package controller;

import model.Maze;
import model.MazeGenerator;
import view.MazeView;

/**
 *
 * @author MSI-PULSE
 */
public class MazeController {
    private Maze model;
    private MazeView view;

    public MazeController(Maze model, MazeView view) {
        this.model = model;
        this.view = view;
    }

    public MazeController() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void generateAndDisplayMaze(int width, int height) {
        MazeGenerator generator = new MazeGenerator();
        model = generator.generate(width, height);
        view.printMaze(model);
    }

    public Maze generateMaze(int width, int height) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

