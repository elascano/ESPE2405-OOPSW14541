/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.objectinfile.model;

import java.io.Serializable;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class Backpack implements Serializable{
    private int id;
    private String color;
    private String brand;
    private String design;
    private String size;

    public Backpack(int id, String color, String brand, String design, String size) {
        this.id = id;
        this.color = color;
        this.brand = brand;
        this.design = design;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Backpack{" + "id=" + getId() + ", color=" + getColor() + ", brand=" + getBrand() + ", design=" + getDesign() + ", size=" + getSize() + '}';
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
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the design
     */
    public String getDesign() {
        return design;
    }

    /**
     * @param design the design to set
     */
    public void setDesign(String design) {
        this.design = design;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
    
    
  
}
    
    
