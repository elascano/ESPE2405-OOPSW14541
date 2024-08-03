
package ec.edu.espe.Speakers.model;

/**
 *
 * @author David Rodriguez
 */
public class Speakers {
    private int id;
    private String brand;
   private float price;
   private int stock;

    public Speakers(int id, String brand, float price, int stock) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.stock = stock;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
