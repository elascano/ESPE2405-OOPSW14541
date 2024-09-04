export class SortingContext {
    setSortStrategy(strategy) {
      this.strategy = strategy;
    }
  
    sort(arr) {
      return this.strategy.sort(arr);
    }
  }
  