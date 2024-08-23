/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.view;

import ec.edu.espe.model.Door;
import ec.edu.espe.model.Maze;
import ec.edu.espe.model.Room;

/**
 *
 * @author DELL
 */

public class MazeView {
        // Método para mostrar el laberinto en formato ASCII
    public void displayMazeInASCII(Maze maze) {
        System.out.println("Displaying the maze in ASCII format:");
        for (Room room : maze.getRooms()) {
            System.out.println("Room with " + room.getNumberOfWalls() + " walls.");
            for (Door door : room.getDoors()) {
                System.out.println("  Door connecting to another room.");
            }
        }
        System.out.println("Entrance: Room with " + maze.getEntrance().getNumberOfWalls() + " walls.");
        System.out.println("Exit: Room with " + maze.getExit().getNumberOfWalls() + " walls.");
    }

    // Método para mostrar el laberinto en formato PNG (aquí solo imprimimos un mensaje de ejemplo)
    public void displayMazeInPNG(Maze maze) {
        System.out.println("Displaying the maze in PNG format.");
        // Aquí podrías implementar lógica para generar una imagen PNG del laberinto
        // En este ejemplo solo imprimimos un mensaje
    }

    // Método para mostrar mensajes generales
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
