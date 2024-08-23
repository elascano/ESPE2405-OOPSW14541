
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
        strategy.sort(numbers);
    }

    public String getSortStrategyName() {
        return strategy.getStrategyName();
    }
}
