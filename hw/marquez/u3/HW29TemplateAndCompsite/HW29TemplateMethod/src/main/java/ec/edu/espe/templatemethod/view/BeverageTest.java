/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.templatemethod.view;

import ec.edu.espe.templatemethod.model.Coffee;
import ec.edu.espe.templatemethod.model.Tea;

/**
 *
 * @author  Jenniffer Marquez  
 */
public class BeverageTest {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        System.out.println("\nMaking tea ...");
        tea.prepareRecipe();
        
        System.out.println("\nMaking coffee ...");
        coffee.prepareRecipe();
    }
}
