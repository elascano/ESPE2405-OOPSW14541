package ec.edu.espe.examnunit2.model;

/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
 */
public class Vehicle {
    private String id;
    private String brand;
    private String color;
    private int year;
    private double price;


    public Vehicle(String id, String brand, String color, int year) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = 0.0;
    }

   
    public Vehicle(String id, String brand, String color, int year, double price) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    // Getter y Setter para id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter y Setter para brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter y Setter para color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter y Setter para year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter y Setter para price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Representación en cadena del objeto Vehicle.
     * 
     * @return Cadena que representa el objeto Vehicle.
     */
    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}