import { BubbleSort } from '../model/BubbleSort.js';
import { InsertionSort } from '../model/InsertionSort.js';
import { QuickSort } from '../model/QuickSort.js';

export class SortingContext {
    constructor() {
        this.ss = null;
    }

    sort(data) {
        let size = data.length;
        this.ss = this.setSortStrategy(size);
        return this.ss.sort(data);
    }

    setSortStrategy(n) {
        if (n >= 2 && n <= 5) {
            return new BubbleSort();
        } else if (n >= 6 && n <= 10) {
            return new InsertionSort();
        } else if (n > 10) {
            return new QuickSort();
        }
    }
}
