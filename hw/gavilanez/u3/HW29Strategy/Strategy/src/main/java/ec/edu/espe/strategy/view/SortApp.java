
package ec.edu.espe.strategy.view;

import ec.edu.espe.strategy.model.SortingContext;
import java.util.Scanner;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class SortApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int number = scanner.nextInt();
        int array[] = new int[number];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < number; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\n Array list without sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        SortingContext sortAlgorithm = new SortingContext();
        sortAlgorithm.sort(array);
        System.out.println("\n Result of the sorted array list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        scanner.close();
    }
}
