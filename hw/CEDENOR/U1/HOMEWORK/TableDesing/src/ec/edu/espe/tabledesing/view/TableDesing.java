/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.tabledesing.view;

import ec.edu.espe.tabledesing.model.Table;

/**
 *
 * @author Nahomi Cedeño, CODE CREATORS, DCCO-ESPE
 */
public class TableDesing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         float totalPrice;
        Table table; 
        
        table = new Table(1, "wood", "brown", 1500.0F);
        
        System.out.println("table ---> " + table);
    }
    
}
