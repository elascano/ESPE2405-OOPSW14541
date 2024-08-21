/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.mazegenerator.controller;

import ec.edu.espe.mazegenerator.model.Maze;
import ec.edu.espe.mazegenerator.model.Room;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public interface RoomActions {
    void adjacentRooms(Maze maze, Room currentRoom);
}
