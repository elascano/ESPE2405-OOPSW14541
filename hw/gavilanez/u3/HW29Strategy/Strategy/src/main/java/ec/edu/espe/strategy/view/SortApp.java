
package ec.edu.espe.strategy.view;

import ec.edu.espe.strategy.model.SortingContext;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class SortApp {
    public static void main(String[] args) {
        int array[] = {3, 6, 4, 6, 7, 8, 5, 6, 7, 5, 3, 3};

        System.out.println("\nArray list without sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        SortingContext sortAlgorithm = new SortingContext();
        sortAlgorithm.sort(array);

        System.out.println("\nResult of the sorted array list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
