/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.model;

/**
 *
 * @author Nahomi Cedeño, CodeCreators, DCCO-ESPE
 */
public class MazeGenerator {
     public Maze createMaze(int N, int M) {
        Maze maze = new Maze(N, M);
        maze.generateMaze();
        return maze;
    }
}
