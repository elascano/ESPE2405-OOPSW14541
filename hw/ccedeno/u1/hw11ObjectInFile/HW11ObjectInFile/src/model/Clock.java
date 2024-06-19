
package model;

import taxes.Sales;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class Clock {
    private int id;
    private String material;
    private String brand;
    private float basePrice;
    private float pvp;

    @Override
    public String toString() {
        return "reloj{" + "id=" + id + ", material=" + material + ", brand=" + brand + ", basePrice=" + basePrice + ", pvp=" + pvp + '}';
    }
    
    
    

    public Clock(int id, String material, String brand, float basePrice, float pvp) {
        this.id = id;
        this.material = material;
        this.brand = brand;
        this.basePrice = basePrice;
        this.pvp = basePrice + Sales.computeIva(5000.0F,30);
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
     * @return the pvp
     */
    public float getPvp() {
        return pvp;
    }

    /**
     * @param pvp the pvp to set
     */
    public void setPvp(float pvp) {
        this.pvp = basePrice + taxes.Sales.computeIva(5000.0F, 30);
    }
    
    
    
}
