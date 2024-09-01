export class SortingContext {
    setSortStrategy(strategy) {
        this.strategy = strategy;
    }

    sort(numbers) {
        if (this.strategy) {
            this.strategy.sort(numbers);
        } else {
            throw new Error("Sorting strategy not set");
        }
    }

    getSortStrategyName() {
        if (this.strategy) {
            return this.strategy.getStrategyName();
        } else {
            return "No strategy set";
        }
    }
}
