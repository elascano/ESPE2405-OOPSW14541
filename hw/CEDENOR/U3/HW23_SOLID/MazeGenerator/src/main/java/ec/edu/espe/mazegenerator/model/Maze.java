/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.model;

import java.util.Random;

/**
 *
 * @author Nahomi Cedeño, CodeCreators, DCCO-ESPE
 */
public class Maze {
private Room[][] rooms;
    private Room entrance;
    private Room exit;
    private int rows;
    private int cols;

    public Maze(int N, int M) {
        this.rows = N;
        this.cols = M;
        rooms = new Room[N][M];
        initializeRooms();
        setEntranceAndExit();
    }

    private void initializeRooms() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rooms[i][j] = new Room();
            }
        }
    }

    private void setEntranceAndExit() {
        entrance = rooms[0][0]; 
        exit = rooms[rows - 1][cols - 1]; 
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void generateMaze() {
        
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i < rows - 1) {
                    rooms[i][j].addDoor(rooms[i + 1][j]); 
                }
                if (j < cols - 1) {
                    rooms[i][j].addDoor(rooms[i][j + 1]); 
                }
            }
        }
    }
}
