/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shopping.model;

import taxes.Sales;

/**
 *
 * @author Nahomi Cedeno
 */
public class CellPhone {
    private int id;
    private String brand;
    private String color;
    private float basePrice;
    private float pvp;

    @Override
    public String toString() {
        return "CellPhone{" + "id=" + id + ", brand=" + brand + ", color=" + color + ", basePrice=" + basePrice + ", pvp=" + pvp + '}';
    }
    
    

    public CellPhone(int id, String brand, String color, float basePrice) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.basePrice = basePrice;
        this.pvp = basePrice + Sales.computeIva(15.0F, basePrice);
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp() {
        this.pvp = basePrice + Sales.computeIva(15.0F, 1000);
    }
    
    
}
