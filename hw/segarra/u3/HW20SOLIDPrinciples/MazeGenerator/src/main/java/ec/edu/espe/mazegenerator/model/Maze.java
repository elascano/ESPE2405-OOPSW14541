/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.model;

import java.util.List;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
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

    /**
     * @return the rooms
     */
    public List<Room> getRooms() {
        return rooms;
    }

    /**
     * @param rooms the rooms to set
     */
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    /**
     * @return the entrance
     */
    public Room getEntrance() {
        return entrance;
    }

    /**
     * @param entrance the entrance to set
     */
    public void setEntrance(Room entrance) {
        this.entrance = entrance;
    }

    /**
     * @return the exit
     */
    public Room getExit() {
        return exit;
    }

    /**
     * @param exit the exit to set
     */
    public void setExit(Room exit) {
        this.exit = exit;
    }

    /**
     * @return the amountOfRooms
     */
    public int getAmountOfRooms() {
        return amountOfRooms;
    }

    /**
     * @param amountOfRooms the amountOfRooms to set
     */
    public void setAmountOfRooms(int amountOfRooms) {
        this.amountOfRooms = amountOfRooms;
    }
    
    public static void generateRoom(){
        System.out.println("Generating a room");
    }
    
}
