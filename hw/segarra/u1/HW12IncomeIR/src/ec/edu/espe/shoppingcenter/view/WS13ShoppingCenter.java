/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.shoppingcenter.view;

import ec.edu.espe.shoppingcenter.modle.CellPhone;
import taxes.Sales;
import taxes.incom;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class WS13ShoppingCenter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float salary = 2000.0F, taxPayment;
        CellPhone cellPhone = new CellPhone(0, "motorola", "black", 2000.0F, 15.0F);
        taxPayment = incom.computeIR(salary);
        
        System.out.println("cellphone --> " + cellPhone.toString() + "\ntax payment = " + taxPayment);
    }
    
}