/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.model.USTax;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class Calculator {

    public static void main(String[] args) {
        USTax tax= USTax.getInstance();
        float total = tax.salesTotal();
        System.out.println("Total sales with taxes " + total);
    }
}
