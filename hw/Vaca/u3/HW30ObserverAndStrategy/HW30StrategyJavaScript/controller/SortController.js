import { BubbleSort } from './BubbleSort.js';
import { InsertionSort } from './InsertionSort.js';
import { QuickSort } from './QuickSort.js';
import { SortingContext } from './SortingContext.js';

export class SortController {
    constructor(model, view) {
        this.model = model;
        this.view = view;
        this.context = new SortingContext();
    }

    sortNumbers() {
        const numbers = this.model.getNumbers();
        if (numbers.length <= 30) {
            this.context.setSortStrategy(new BubbleSort());
        } else if (numbers.length <= 100) {
            this.context.setSortStrategy(new InsertionSort());
        } else {
            this.context.setSortStrategy(new QuickSort());
        }

        this.context.sort(numbers);
        this.view.displaySortedNumbers(numbers, this.context.getSortStrategyName());
    }
}
