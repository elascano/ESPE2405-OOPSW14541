package espe.edu.ec.SortApp.model;

import espe.edu.ec.SortApp.controller.SortingStrategy;

/**
 *
 * @author Ismael Travez, TheJavaBandits, DCCO-ESPE
 */
public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        return array;
    }
}
