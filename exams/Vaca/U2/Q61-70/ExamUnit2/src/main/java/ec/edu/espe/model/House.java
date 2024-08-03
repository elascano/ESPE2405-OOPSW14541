/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

/**
 *
 * @author G406
 */
public class House {
    private String id;
    private String name;
    private double area;
    private double pricePerSquareMeter;

    // Constructor
    public House(String id, String name, double area, double pricePerSquareMeter) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPricePerSquareMeter() {
        return pricePerSquareMeter;
    }

    public void setPricePerSquareMeter(double pricePerSquareMeter) {
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    // Business logic
    public double calculateTotalPrice() {
        return area * pricePerSquareMeter;
    }

    public double calculateTax(double rate) {
        return calculateTotalPrice() * rate;
    }
}
