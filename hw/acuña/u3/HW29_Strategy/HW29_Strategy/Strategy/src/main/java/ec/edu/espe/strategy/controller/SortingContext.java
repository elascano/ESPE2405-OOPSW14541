package ec.edu.espe.strategy.controller;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE
 */
public class SortingContext {

    public static SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 30) {
            BubbleSort ss = new BubbleSort();
            return ss;

        } else if (n >= 30 && n < 100) {
            InsertionSort ss = new InsertionSort();
            return ss;

        } else {
            QuickSort ss = new QuickSort();
            return ss;
        }

    }
}
