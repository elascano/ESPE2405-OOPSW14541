/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shopping.model;

import taxes.Sales;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class CellPhone {
    private int id;
    private String brant;
    private String color;
    private float basePrice;
    private float pvp;

    public CellPhone(int id, String brant, String color, float basePrice, float pvp) {
        this.id = id;
        this.brant = brant;
        this.color = color;
        this.basePrice = basePrice;
        this.pvp = basePrice + Sales.computeIva(15.0F, basePrice);
    }

    @Override
    public String toString() {
        return "CellPhone{" + "id=" + id + ", brant=" + brant + ", color=" + color + ", basePrice=" + basePrice + ", pvp=" + pvp + '}';
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
     * @return the brant
     */
    public String getBrant() {
        return brant;
    }

    /**
     * @param brant the brant to set
     */
    public void setBrant(String brant) {
        this.brant = brant;
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
        this.pvp = pvp;
    }
    
}