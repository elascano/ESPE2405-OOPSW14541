const BubbleSort = require('../model/BubbleSort');
const InsertionSort = require('../model/InsertionSort');
const QuickSort = require('../model/QuickSort');
const MongoDBController = require('./MongoDBController');

class SortingContext {
    constructor() {
        this.strategy = null;
    }

    setSortStrategy(array) {
        if (array.length >= 2 && array.length <= 5) {
            this.strategy = new BubbleSort();
        } else if (array.length > 5 && array.length <= 10) {
            this.strategy = new InsertionSort();
        } else {
            this.strategy = new QuickSort();
        }
    }

    sort(array) {
        this.setSortStrategy(array);
        const sortedArray = this.strategy.sort(array);
        const sortType = this.strategy.constructor.name;
        
        MongoDBController.saveSortedArray(sortType, sortedArray);

        return { sortedArray, sortType };
    }
}

module.exports = SortingContext;
