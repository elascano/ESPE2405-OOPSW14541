
package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.controller.USTax;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        float total;
        USTax tax = USTax.getInstance();
        total = tax.salesTotal();
        System.out.println("Total Sale: " + total);
        
    }
            
}
