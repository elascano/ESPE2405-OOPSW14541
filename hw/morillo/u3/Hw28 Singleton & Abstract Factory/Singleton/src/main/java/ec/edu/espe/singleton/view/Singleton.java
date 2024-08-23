/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.singleton.view;

import ec.ec.edu.espe.singleton.model.USTax;

/**
 *
 * @author David Morillo, JavaSquad, DCCO-ESPE
 */
public class Singleton {

    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        tax.salesTotal();
    }
}
