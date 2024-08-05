/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espe.geometricfigurescalculator.model;

/**
 *
 * @author Volumen of a Cilinder - Doménica Villagómez, Alexis Viteri
 */
public class Cylinder {

    private double radius;
    private double height;
    private double volume;  

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.volume = utils.CalculatorOfCylinderVolume.computeVolume(radius, height);  
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.volume = utils.CalculatorOfCylinderVolume.computeVolume(radius, height);  
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.volume = utils.CalculatorOfCylinderVolume.computeVolume(radius, height);  
    }
}