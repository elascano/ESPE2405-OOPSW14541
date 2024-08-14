/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.hw23_solid.model;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class Maze implements IMaze {
    private final int width;
    private final int height;

    public Maze(int width, int height) {
        System.out.println("Creando laberinto...");
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public IRoom getRoom(int x, int y) {
        return new Room();
    }
}