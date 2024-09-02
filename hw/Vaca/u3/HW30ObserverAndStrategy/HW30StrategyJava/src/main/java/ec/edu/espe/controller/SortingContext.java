package ec.edu.espe.controller;

/**
 *
 * @author MSI-PULSE
 */
public class SortingContext {
    private SortingStrategy strategy;

    public void setSortStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] numbers) {
        if (strategy != null) {
            strategy.sort(numbers);
        } else {
            throw new IllegalStateException("Sorting strategy not set");
        }
    }

    public String getSortStrategyName() {
        if (strategy != null) {
            return strategy.getStrategyName();
        } else {
            return "No strategy set";
        }
    }
}
