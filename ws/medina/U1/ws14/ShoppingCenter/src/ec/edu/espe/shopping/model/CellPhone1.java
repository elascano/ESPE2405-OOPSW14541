/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.shopping.model;

import Taxes.Sales;

/**
 *
 * @author Simone Medina, JavaSquad, DCCO-ESPE
 */
public class CellPhone1 {
    private int id;
    private String color;
    private String brand;
    private float basePrice;
    private float Pvp;

    public CellPhone1(int id, String color, String brand, float basePrice) {
        this.id = id;
        this.color = color;
        this.brand = brand;
        this.basePrice = basePrice;
        this.Pvp = basePrice +Sales.computeIva(15.0F,1000);
    }

    @Override
    public String toString() {
        return "CellPhone{" + "id=" + id + ", color=" + color + ", brand=" + brand + ", basePrice=" + basePrice + ", Pvp=" + Pvp + '}';
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
     * @return the Pvp
     */
    public float getPvp() {
        return Pvp;
    }

    /**
     * @param Pvp the Pvp to set
     */
    public void setPvp() {
        this.Pvp = basePrice +Sales.computeIva(15.0F,1000);
    }

   
}
