
package ec.edu.espe.templatemethod.view;

import ec.edu.espe.templatemethod.model.CaffeineBeverage;
import ec.edu.espe.templatemethod.model.Coffee;
import ec.edu.espe.templatemethod.model.Tea;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class BeverageTest {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
