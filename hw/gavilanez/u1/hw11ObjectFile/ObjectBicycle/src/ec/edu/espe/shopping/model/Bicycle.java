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
public class Bicycle {
    private String brant;
    private String model;
    private String color;
    private int age;
    private float basePrice;
    private float pvp;

    public Bicycle(String brant, String model, String color, int age, float basePrice, float pvp) {
        this.brant = brant;
        this.model = model;
        this.color = color;
        this.age = age;
        this.basePrice = basePrice;
        this.pvp = basePrice + Sales.computeIva(15.0F, basePrice);
    }

    @Override
    public String toString() {
        return "Bicycle{" + "brant=" + brant + ", model=" + model + ", color=" + color + ", age=" + age + ", basePrice=" + basePrice + ", pvp=" + pvp + '}';
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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
