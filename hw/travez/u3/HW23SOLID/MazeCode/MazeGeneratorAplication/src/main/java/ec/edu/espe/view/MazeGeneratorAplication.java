package ec.edu.espe.view;

import ec.edu.espe.controller.MazeController;
import ec.edu.espe.model.Door;
import ec.edu.espe.model.Room;
import ec.edu.espe.model.Wall;
import java.util.Arrays;
import utils.NumberGenerator;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class MazeGeneratorAplication {

    public static void main(String[] args) {
        NumberGenerator.generateNumber();
        MazeController.createMaze();
        MazeController mazeController = new MazeController(Arrays.asList(
                new Room(),
                new Wall(),
                new Door()
        ));
        mazeController.generateRoom();
    }
}
