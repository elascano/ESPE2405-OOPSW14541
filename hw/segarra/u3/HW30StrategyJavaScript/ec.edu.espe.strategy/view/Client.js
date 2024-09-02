class SortApp {
    constructor() {
        this.context = new SortingContext();
    }

    setSortingStrategy(strategy) {
        this.context.setSortStrategy(strategy);
    }

    performSort(data) {
        return this.context.sort(data);
    }
}

const app = new SortApp();

const data = [5, 2, 9, 1, 5, 6];

app.setSortingStrategy(new BubbleSort());
console.log(app.performSort(data));

app.setSortingStrategy(new QuickSort());
console.log(app.performSort(data));

app.setSortingStrategy(new InsertionSort());
console.log(app.performSort(data));
