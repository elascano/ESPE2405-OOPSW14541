/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.hw23_solid.view;

import ec.edu.espe.hw23_solid.controller.IMazeController;
import ec.edu.espe.hw23_solid.controller.MazeController;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class MazeAplication {

    public static void main(String[] args) {
        IMazeController controller = new MazeController();
        controller.createAndDisplayMaze(5, 5); 
    }
}
