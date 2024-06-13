/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.tabledesing.model;

import taxes.Sales;

/**
 *
 * @author Nahomi Cedeno
 */
public class Table {
    private int id;
    private String material;
    private String color;
    private float basePrice;
    private float pvp;

    public Table(int id, String material, String color, float basePrice) {
        this.id = id;
        this.material = material;
        this.color = color;
        this.basePrice = basePrice;
        this.pvp = basePrice + Sales.computeIva(12.0F, basePrice);
    }

    @Override
    public String toString() {
        return "Table{" + "id=" + id + ", material=" + material + ", color=" + color + ", basePrice=" + basePrice + ", pvp=" + pvp + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
        this.pvp = basePrice + Sales.computeIva(12.0F, basePrice);
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }
    
}
