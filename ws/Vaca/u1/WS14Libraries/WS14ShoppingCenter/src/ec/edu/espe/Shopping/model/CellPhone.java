/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Shopping.model;

import Taxes.Sales;  
/**
 *
 * @author MSI-PULSE
 */
public class CellPhone {
    private int id;
    private String brand;
    private String color;
    private float basePrice;
    private float pvp;

    @Override
    public String toString() {
        return "CellPhone{" + "id=" + id + ", brand=" + brand + ", color=" + color + ", basePrice=" + basePrice + ", pvp=" + pvp + '}';
    }

    public CellPhone(int id, String brand, String color, float basePrice) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.basePrice = basePrice;
        this.pvp = basePrice + Sales.computeIVA(15.0F, basePrice);  // Accede correctamente al método
    }

    // Getters y setters...

    public void setPvp() {
        this.pvp = basePrice + Sales.computeIVA(15.0F, basePrice);  // Asegúrate de que el paquete y método sean correctos
    }
}
