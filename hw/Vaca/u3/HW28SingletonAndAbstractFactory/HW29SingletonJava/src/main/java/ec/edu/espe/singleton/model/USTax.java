/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singleton.model;

/**
 *
 * @author MSI-PULSE
 */
public class USTax {
    private static USTax instance;
    private double taxRate;

    private USTax() {
        this.taxRate = 0.07; 
    }

    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public double calculateTax(double saleAmount) {
        return saleAmount * taxRate;
    }
}
