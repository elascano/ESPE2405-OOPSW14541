/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class Maze {
    protected List<Room> rooms;
    protected Room entrance;
    protected Room exit;
    protected int amountOfRooms;

    public Maze(List<Room> rooms, Room entrance, Room exit, int amountOfRooms) {
        this.rooms = rooms;
        this.entrance = entrance;
        this.exit = exit;
        this.amountOfRooms = amountOfRooms;
    }


    public List<Room> getRooms() {
        return rooms;
    }


    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }


    public Room getEntrance() {
        return entrance;
    }


    public void setEntrance(Room entrance) {
        this.entrance = entrance;
    }

    public Room getExit() {
        return exit;
    }


    public void setExit(Room exit) {
        this.exit = exit;
    }

    /**
     * @return the amountOfRooms
     */
    public int getAmountOfRooms() {
        return amountOfRooms;
    }

    public void setAmountOfRooms(int amountOfRooms) {
        this.amountOfRooms = amountOfRooms;
    }
    
    public static void generateRoom(){
        System.out.println("Generating a room");
    }
    
}