
package espe.edu.ec.alamcen.model;
import java.util.ArrayList;
/**
 *
 * @author G400
 */

public class Cellphone {
    private String id;
    private String brand;
    private String model;
    private double price;

    public Cellphone(String id, String brand, String model, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cellphone{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + '}';
    }
}

