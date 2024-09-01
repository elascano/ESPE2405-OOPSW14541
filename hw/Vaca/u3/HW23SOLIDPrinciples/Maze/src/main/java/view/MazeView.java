
package view;

import controller.MazeController;
import model.Maze;

/**
 *
 * @author MSI-PULSE
 */

public class MazeView {

    public static void main(String[] args) {
        
        int width = 5;
        int height = 5;

        
        MazeController controller = new MazeController();

        
        Maze maze = controller.generateMaze(width, height);

        
        MazeView view = new MazeView();
        view.printMaze(maze);
    }

    
    public void printMaze(Maze maze) {
        System.out.println("Laberinto en formato ASCII:");
    }

    
}


