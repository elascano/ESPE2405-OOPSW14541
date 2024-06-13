package ec.edu.espe.mouse.model;

/**
 
 * 
 * @autor MSI-PULSE
 */
public class Mouse {
    private String brand;
    private String size;
    private boolean wireless;
    private double price;

    public Mouse(String brand, String size, boolean wireless, double price) {
        this.brand = brand;
        this.size = size;
        this.wireless = wireless;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "marca='" + brand + '\'' +
                ", tamaño='" + size + '\'' +
                ", Inalámbrico='" + (wireless ? "sí" : "no") + '\'' +
                ", precio=$" + price +
                '}';
    }
}
