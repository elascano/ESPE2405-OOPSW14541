package ec.edu.espe.view;

import ec.edu.espe.controller.DoorController;
import ec.edu.espe.controller.MazeController;
import ec.edu.espe.controller.RoomController;
import ec.edu.espe.controller.SolutionPathController;
import ec.edu.espe.controller.WallController;
import ec.edu.espe.controller.WrongPathController;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class MazeGeneratorAplication {
    public static void main(String[] args) {
        MazeController.generateMaze();
        RoomController.generateRoom();
        WallController.addWall();
        DoorController.addDoor();
        RoomController.validationRoom();
        RoomController.validationAdjoiningRoom();
        WrongPathController wpc = new WrongPathController();
        wpc.findPathRoute();
        wpc.validatePath();
        SolutionPathController spc = new SolutionPathController();
        spc.findPathRoute();
        spc.validatePath();
        MazeController.saveMazeAsAscii();
        MazeController.saveMazeAsImage();
        
    }
}
