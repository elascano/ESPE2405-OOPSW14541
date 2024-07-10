package ec.edu.espe.shipping.model;

import taxes.Sales;


/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class Cellphone {
    int id;
    String brand;
    String color;
    float basePrice;
    float pvp;

    public Cellphone(int id, String brand, String color, float basePrice) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.basePrice = basePrice;
        this.pvp = basePrice + Sales.computerIva(15.0F,basePrice);
    }

    @Override
    public String toString() {
        return "Cellphone{" + "id=" + id + ", brand=" + brand + ", color=" + color + ", basePrice=" + basePrice + ", pvp=" + pvp + '}';
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

    public void setPvp(float pvp) {
        this.pvp = basePrice + Sales.computerIva(15.0F,1000);
    }
    
}
