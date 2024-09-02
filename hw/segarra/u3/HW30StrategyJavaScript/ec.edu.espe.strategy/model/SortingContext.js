class SortingContext {
    constructor() {
        this.strategy = null;
    }

    setSortStrategy(strategy) {
        this.strategy = strategy;
    }

    sort(data) {
        if (!this.strategy) {
            throw new Error("Sorting strategy is not set.");
        }
        return this.strategy.sort(data);
    }
}
