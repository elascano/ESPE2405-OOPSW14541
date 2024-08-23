
package ec.edu.espe.view;

import java.util.Scanner;

/**
 *
 * @author MSI-PULSE
 */
public class SortView {
    public int[] getInputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public void displaySortedNumbers(int[] numbers, String strategy) {
        System.out.println("Sorted using " + strategy + ":");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
