/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shoppingcenter.view;

import ec.edu.espe.shoppingcenter.model.Cellphone;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class ShoppingCenter {
    public static void main(String[] args) {
        float totalPrice;
        Cellphone cellphone;
        
        cellphone = new Cellphone(1, "motorola", "black", 200.0F);
        
        System.out.println("Celular: " + cellphone);
        
        float taxPerYear =  taxes.Income.computeIR(1500);
        System.out.println("Impuesto anual es " + taxPerYear);
    }
}
