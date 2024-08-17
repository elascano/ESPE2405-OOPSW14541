/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.hw23_solid.model;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class MazeGenerator implements IMazeGenerator {

    @Override
    public IMaze generateMaze(int width, int height) {
        System.out.println("Generando laberinto...");
        System.out.println("Generando paredes...");
        System.out.println("Generando caminos...");
        System.out.println("Colocando puertas...");
        
        return new Maze(width, height);
    }
}