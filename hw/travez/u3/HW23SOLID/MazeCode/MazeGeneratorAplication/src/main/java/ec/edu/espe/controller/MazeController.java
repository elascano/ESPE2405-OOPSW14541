/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

import java.util.List;
import utils.NumberGenerator;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class MazeController {

    private final List<MazeComponent> components;

    public static void createMaze() {
        System.out.println("Create Maze");
    }

    public MazeController(List<MazeComponent> components) {
        this.components = components;
    }

    public void generateRoom() {
        for (MazeComponent component : components) {
            component.generate();
        }

        System.out.println("Maze generation completed.");
    }
}
