/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.mazegenerator.view;

import ec.edu.espe.mazegenerator.controller.MazeController;

/**
 *
* @author Nahomi Cedeño, CodeCreators, DCCO-ESPE
 */
public class MazeMain {

    public static void main(String[] args) {
        MazeView view = new MazeView();
        MazeController controller = new MazeController(view);

        controller.createMaze(5, 5); 
        controller.renderMaze(); 
    }
}

