/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.examnunit2.model;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class Keyboard {
    private String id;
    private String brand;
    private String dateOfManufacture;
    private String dateOfUse;
    private Long usageTime;

    public Keyboard(String id, String brand, String dateOfManufacture, String dateOfUse, Long usageTime) {
        this.id = id;
        this.brand = brand;
        this.dateOfManufacture = dateOfManufacture;
        this.dateOfUse = dateOfUse;
        this.usageTime = usageTime;
    }
    
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
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
     * @return the dateOfManufacture
     */
    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    /**
     * @param dateOfManufacture the dateOfManufacture to set
     */
    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    /**
     * @return the dateOfUse
     */
    public String getDateOfUse() {
        return dateOfUse;
    }

    /**
     * @param dateOfUse the dateOfUse to set
     */
    public void setDateOfUse(String dateOfUse) {
        this.dateOfUse = dateOfUse;
    }

    /**
     * @return the usageTime
     */
    public Long getUsageTime() {
        return usageTime;
    }

    /**
     * @param usageTime the usageTime to set
     */
    public void setUsageTime(Long usageTime) {
        this.usageTime = usageTime;
    }
}
