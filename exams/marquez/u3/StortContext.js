class SortingContext {
    setStrategy(strategy) {
        this.strategy = strategy;
    }

    sortArray(arr) {
        return this.strategy.sort(arr);
    }
}
