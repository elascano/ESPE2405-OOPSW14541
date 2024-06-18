/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.shoppingcenter.view;

import ec.edu.espe.shoppingcenter.model.CellPhone;
import taxess.Income;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class Ws13ShoppingCenter {
    public static void main(String[] args) {
        float totalPrice;
        CellPhone cellPhone = new CellPhone(001, "Iphone", "black", 150.00F);
        
        System.out.println(cellPhone);
        
        float salary = 34255 / 12F;
        float computeIR = Income.computeIR(salary);
        System.out.println("Salary is: "+ salary + "\nThe IR is: "+ computeIR);
        
    }
    
}
