package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class Chicken {
    private int ID;
    private String name;

    @Override
    public String toString() {
        return "Chicken{" + "ID=" + ID + ", name=" + name + '}';
    }

    public Chicken(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    
    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
