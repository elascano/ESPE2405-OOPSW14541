/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shoppingcenter.model;

import taxes.sales;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class CellPhone {
    private int id;
    private String model;
    private String color;
    private float basePrice;
    private float pvp;

    public CellPhone(int id, String model, String color, float basePrice) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.basePrice = basePrice;
        this.pvp = basePrice + sales.computeIva(0.15F, basePrice);
    }

    @Override
    public String toString() {
        return "CellPhone{" + "id=" + id + ", model=" + model + ", color=" + color + ", basePrice=" + basePrice + ", pvp=" + pvp + '}';
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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
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
     * @return the basePrice
     */
    public float getBasePrice() {
        return basePrice;
    }

    /**
     * @param basePrice the basePrice to set
     */
    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * @return the pvp
     */
    public float getPvp() {
        return pvp;
    }

    /**
     * @param pvp the pvp to set
     */
    public void setPvp(float pvp) {
        this.pvp = basePrice + sales.computeIva(0.15F, basePrice);
    }
    
    
}
