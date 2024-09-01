
package ec.edu.espe.controller;

/**
 *
 * @author MSI-PULSE
 */
public interface SortingStrategy {
    void sort(int[] numbers);
    String getStrategyName();
}
