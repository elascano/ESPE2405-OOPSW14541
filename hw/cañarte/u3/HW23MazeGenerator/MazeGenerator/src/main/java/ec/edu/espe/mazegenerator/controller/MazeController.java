package ec.edu.espe.mazegenerator.controller;

import ec.edu.espe.mazegenerator.model.*;
import ec.edu.espe.mazegenerator.view.MazeGenerated;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MazeController {
    private final Maze model;
    private final MazeGenerated view;
    private final RoomController roomController;
    private final Random random = new Random();

    public MazeController(Maze model, MazeGenerated view, RoomController roomController) {
        this.model = model;
        this.view = view;
        this.roomController = roomController;
    }
    public void printMaze() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter height: ");
            int height = scanner.nextInt();

            System.out.print("Enter width: ");
            int width = scanner.nextInt();

            model.setWidth(width);
            model.setHeight(height);
            generateMaze(width, height);
    }
    
    public void generateMaze(int width, int height) {
        model.generate(width, height);
        System.out.println("Maze generated.");
        roomController.connectRooms();
        roomController.validateRooms();
        setEntranceAndExit();
    }

    private void setEntranceAndExit() {
        Room[][] rooms = model.getRooms();
        int width = model.getWidth();
        int height = model.getHeight();
        int entranceX = random.nextInt(width);
        int entranceY = random.nextInt(height);
        int exitX;
        int exitY;
        
        do {
            exitX = random.nextInt(width);
            exitY = random.nextInt(height);
        } while (entranceX == exitX && entranceY == exitY);

        rooms[entranceX][entranceY].setEntrance(true);
        rooms[exitX][exitY].setExit(true);
    }

    public void updateView() {
        String mazeDetails = "Maze dimensions: " + model.getWidth() + "x" + model.getHeight();
        view.printMazeDetails(mazeDetails);
        view.printMaze(model);
        Room[][] rooms = model.getRooms();
        for (int i = 0; i < model.getWidth(); i++) {
            for (int j = 0; j < model.getHeight(); j++) {
                Room room = rooms[i][j];
                if (room.isEntrance()) {
                    System.out.println("Entrance is at room (" + i + ", " + j + ")");
                }
                if (room.isExit()) {
                    System.out.println("Exit is at room (" + i + ", " + j + ")");
                }
            }
        }
    }
}

