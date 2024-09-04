import { BubbleSort } from './BubbleSort.js';
import { InsertionSort } from './InsertionSort.js';
import { QuickSort } from './QuickSort.js';

export class SortingContext {
    sort(data) {
        const size = data.length;
        const strategy = this.setSortStrategy(size);
        this.usedStrategy = strategy.constructor.name;
        return strategy.sort(data);
    }

    setSortStrategy(size) {
        if (size > 0 && size < 30) {
            return new BubbleSort();
        } else if (size >= 30 && size < 100) {
            return new InsertionSort();
        } else {
            return new QuickSort();
        }
    }

    getUsedStrategy() {
        return this.usedStrategy;
    }
}
