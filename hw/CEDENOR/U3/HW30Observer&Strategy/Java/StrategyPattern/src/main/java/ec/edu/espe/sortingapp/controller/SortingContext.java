package ec.edu.espe.sortingapp.controller;

/**
 *
 * @author Nahomi Cedeño, codecreators, DCCO - ESPE
 */
public class SortingContext {
    private SortingStrategy sortingStrategy;

    public int[] sort(int[] data) {
        int size = data.length;
        sortingStrategy = setSortStrategy(size);
        return sortingStrategy.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 30) {
            sortingStrategy = new BubbleSort();
            System.out.println("Sorting by Bubble Sort");
        } else if (n >= 30 && n < 100) {
            sortingStrategy = new InsertionSort();
            System.out.println("Sorting by Insertion Sort");
        } else if (n >= 100) {
            sortingStrategy = new QuickSort();
            System.out.println("Sorting by Quick Sort");
        }
        return sortingStrategy;
    }
}
