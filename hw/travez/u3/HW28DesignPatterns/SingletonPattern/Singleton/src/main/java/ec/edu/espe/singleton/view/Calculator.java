/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.controller.USTax;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class Calculator {

    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        System.out.println("Number of Products: 8\nPrice: 5$");
        System.out.println("Total sale: " + tax.salesTotal(8.0F, 5));
        USTax tax2 = USTax.getInstance();
    }
}
