export class SortingController {
    constructor() {
        this.sortingStrategies = {
            'BubbleSort': new BubbleSort(),
            'InsertionSort': new InsertionSort(),
            'QuickSort': new QuickSort()
        };
    }

    sortAndDisplay(numbersArray, method, callback) {
        const strategy = this.sortingStrategies[method];
        if (!strategy) {
            alert('Unknown sorting method.');
            return;
        }
        const sortedNumbers = strategy.sort(numbersArray);
        if (callback) {
            callback(sortedNumbers, method);
        }
    }
}

