package espe.edu.ec.SortApp.controller;

import espe.edu.ec.SortApp.model.BubbleSort;
import espe.edu.ec.SortApp.model.InsertionSort;
import espe.edu.ec.SortApp.model.QuickSort;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */

public class SortingContext {
    private SortingStrategy ss;

    public int[] sort(int data[]) {
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }

    // Method to choose the sorting strategy based on the number of elements
    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 30) {
            ss = new BubbleSort();  // Use BubbleSort for 1 to 29 elements
        } else if (n >= 30 && n < 100) {
            ss = new InsertionSort();  // Use InsertionSort for 30 to 99 elements
        } else if (n >= 100) {
            ss = new QuickSort();  // Use QuickSort for 100 or more elements
        }
        return ss;
    }
}