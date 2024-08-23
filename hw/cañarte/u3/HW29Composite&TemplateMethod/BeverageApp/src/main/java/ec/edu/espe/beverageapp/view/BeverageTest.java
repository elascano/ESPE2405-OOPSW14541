package ec.edu.espe.beverageapp.view;

import ec.edu.espe.beverageapp.controller.Coffee;
import ec.edu.espe.beverageapp.controller.Tea;

/**
 *
 * @author Saray Cañarte
 */
public class BeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        System.out.println("Making tea ...");
        tea.prepareRecipe();
        
        System.out.println("--------------------\n");
        
        System.out.println("Making coffee ...");
        coffee.prepareRecipe();
        
    }
}
