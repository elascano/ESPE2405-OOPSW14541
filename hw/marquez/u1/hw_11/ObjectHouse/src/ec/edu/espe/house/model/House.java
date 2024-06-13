/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.house.model;

/**
 *
 * @author Jenniffer Marquez, Javasquad, DCCO-ESPE
 */
public class House {
    private String color;
    private int id;
    private String direction;
    private int floors;
    private String material;

    public House(String color, int id, String direction, int floors, String material) {
        this.color = color;
        this.id = id;
        this.direction = direction;
        this.floors = floors;
        this.material = material;
    }

    @Override
    public String toString() {
        return "House{" + "color=" + color + ", id=" + id + ", direction=" + direction + ", floors=" + floors + ", material=" + material + '}';
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * @return the floors
     */
    public int getFloors() {
        return floors;
    }

    /**
     * @param floors the floors to set
     */
    public void setFloors(int floors) {
        this.floors = floors;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    
    
}
