/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shoppingcenter.model;

import taxes.Sales;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class Cellphone {
    private int id;
    private String brand;
    private String color;
    private float basePrice;
    private float pvp;

    public Cellphone(int id, String brand, String color, float basePrice) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.basePrice = basePrice;
        this.pvp = basePrice+ Sales.computeIva(15.0F, basePrice);
    }

    @Override
    public String toString() {
        return "Cellphone{" + "id=" + id + ", brand=" + brand + ", color=" + color + ", basePrice=" + basePrice + ", pvp=" + pvp + '}';
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
        this.pvp = basePrice + taxes.Sales.computeIva(15.0F, 1000);
    }
    
    
}
