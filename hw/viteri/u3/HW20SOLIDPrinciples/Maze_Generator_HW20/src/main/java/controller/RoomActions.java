/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Maze;
import model.Room;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public interface RoomActions {
    void adjacentRooms(Maze maze, Room currentRoom);
}