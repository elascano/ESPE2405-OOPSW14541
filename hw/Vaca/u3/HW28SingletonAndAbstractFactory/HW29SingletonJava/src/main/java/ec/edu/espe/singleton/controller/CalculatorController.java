/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singleton.controller;

import ec.edu.espe.singleton.model.USTax;
/**
 *
 * @author MSI-PULSE
 */


public class CalculatorController {
    public double getTotalSale(double saleAmount) {
        USTax tax = USTax.getInstance();
        return saleAmount + tax.calculateTax(saleAmount);
    }
}