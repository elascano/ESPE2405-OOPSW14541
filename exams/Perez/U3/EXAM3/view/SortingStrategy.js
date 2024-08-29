import BubbleSort from './BubbleSort.js';
import QuickSort from './QuickSort.js';
import InsertionSort from './InsertionSort.js';

class SortingStrategy {
    constructor() {
        this.strategy = null;
    }

    setStrategy(strategy) {
        this.strategy = strategy;
    }

    sort(arr) {
        if (!this.strategy) {
            throw new Error('No sorting strategy set');
        }
        return this.strategy.sort(arr);
    }
}

function getStrategy(arr) {
    if (arr.length < 2) {
        throw new Error("El array debe contener más de 1 elemento");
    } else if (arr.length <= 5) {
        return new BubbleSort();
    } else if (arr.length <= 10) {
        return new InsertionSort();
    } else {
        return new QuickSort();
    }
}

export { SortingStrategy, getStrategy };
