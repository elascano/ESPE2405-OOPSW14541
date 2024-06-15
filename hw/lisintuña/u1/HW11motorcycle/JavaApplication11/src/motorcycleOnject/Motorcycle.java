/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorcycleOnject;

public class Motorcycle {
    private String brand;
    private String model;
    private String year;

    // Constructor para inicializar los atributos
    public Motorcycle(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Métodos getter para obtener los valores de los atributos
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }
}
