class SortContext {
    constructor(strategy) {
        this.strategy = strategy;
    }

    setStrategy(strategy) {
        this.strategy = strategy;
    }

    executeStrategy(data) {
        return this.strategy.sort(data);
    }
}
