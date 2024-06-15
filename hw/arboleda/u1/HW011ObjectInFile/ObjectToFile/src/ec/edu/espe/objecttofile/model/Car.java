package ec.edu.espe.objecttofile.model;
import java.io.Serializable;

/**
 *
 * @author Abner Arboleda, LogicLegion, DCCO-ESPE 
 *
 */

public class Car implements Serializable {
    private static final long serialVersionUID = 1L; 
    private String brand;
    private String model;
    private int age;
    private String color;

    public Car(String brand, String model, int age, String color) {
        this.brand = brand;
        this.model = model;
        this.age = age;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + ", age=" + age + ", color=" + color + "]";
    }
    
}