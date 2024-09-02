package ec.edu.espe.strategypattern.controller;

import ec.edu.espe.strategypattern.controller.QuickSort;
import ec.edu.espe.strategypattern.controller.InsertionSort;
import ec.edu.espe.strategypattern.controller.BubbleSort;
import ec.edu.espe.strategypattern.view.SortingStrategy;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class SortingContext {
private SortingStrategy ss;
    private String usedStrategy;

    public int[] sort(int data[]) {
        int size = data.length;
        ss = setSortStrategy(size);
        usedStrategy = ss.getClass().getSimpleName();  // Get the name of the sorting strategy class
        return ss.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 30) {
            ss = new BubbleSort();
        } else if (n >= 30 && n < 100) {
            ss = new InsertionSort();
        } else if (n >= 100) {
            ss = new QuickSort();
        }
        return ss;
    }

    public String getUsedStrategy() {
        return usedStrategy;
    }

}
