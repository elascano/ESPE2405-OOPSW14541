/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.view;

import ec.edu.espe.mazegenerator.model.Maze;
import ec.edu.espe.mazegenerator.model.Room;

/**
 *
* @author Nahomi Cedeño, CodeCreators, DCCO-ESPE
 */
public class MazeView {
    public void displayMaze(Maze maze) {
        Room[][] rooms = maze.getRooms();
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print("[ ]"); 
            }
            System.out.println();
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
