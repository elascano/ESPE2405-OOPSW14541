
package ec.edu.espe.computer.model;

import java.io.Serializable;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class Computer implements Serializable {
     private static final long serialVersionUID = 1L;
    private int id;
    private String brand;
    private String color;
    private String model;
    private int year;

    public Computer(int id, String brand, String color, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Computer{" + "id=" + id + ", brand=" + brand + ", color=" + color + ", model=" + model + ", year=" + year + '}';
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    
}
