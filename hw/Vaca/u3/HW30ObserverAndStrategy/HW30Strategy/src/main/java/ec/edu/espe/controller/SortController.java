
package ec.edu.espe.controller;

import ec.edu.espe.model.SortModel;
import ec.edu.espe.view.SortView;

/**
 *
 * @author MSI-PULSE
 */
public class SortController {
    private SortModel model;
    private SortView view;
    private SortingContext context;

    public SortController(SortModel model, SortView view) {
        this.model = model;
        this.view = view;
        this.context = new SortingContext();
    }

    public void sortNumbers() {
        int[] numbers = model.getNumbers();
        if (numbers.length <= 30) {
            context.setSortStrategy(new BubbleSort());
        } else if (numbers.length <= 100) {
            context.setSortStrategy(new InsertionSort());
        } else {
            context.setSortStrategy(new QuickSort());
        }

        context.sort(numbers);
        view.displaySortedNumbers(numbers, context.getSortStrategyName());
    }
}