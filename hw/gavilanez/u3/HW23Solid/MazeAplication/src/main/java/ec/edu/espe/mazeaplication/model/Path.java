/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazeaplication.model;

import java.util.ArrayList;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public abstract class Path {
    private int id;
    private Door door;
    private ArrayList<Room> rooms;
    
    public abstract void findPathRoute();
    public abstract void validatePath();
}
