/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shoppingcenter.view;

import ec.edu.espe.shoppingcenter.controller.CellPhone;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class ShoppingCenter {
    public static void main(String[] args) {
        float totalPrice;
        CellPhone cellPhone;
        
        cellPhone = new CellPhone(0,"motorola","black",2000.0F,15.0F);
        
        System.out.println("cellphone ---> " + cellPhone);
        
        float salary = 2500;
        
        float impuestoAnual = taxes.Income.computeIR(salary);
        
        System.out.println("El impuesto anual es: " + impuestoAnual);
        
    }
}
