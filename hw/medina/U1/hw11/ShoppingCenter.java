/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.shopping.view;

import ec.edu.espe.shopping.model.CellPhone1;
import ec.edu.espe.shopping.model.Sweater;

/**
 *
 * @author Simone Medina, JavaSquad, DCCO-ESPE
 */
public class ShoppingCenter {
    public static void main (String [] args){
        float totalPrice;
        CellPhone1 cellPhone;
        Sweater sweater;
        
        cellPhone = new CellPhone1(0,"Black","Motorola",200.0F);
        System.out.println("cell phone --> " + cellPhone);
        sweater = new Sweater(12,"Red","Pull & bear",5.0F);
        System.out.println("Sweater --> " + sweater);

    }
    
    
}
