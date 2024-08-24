
package ec.edu.espe.controller;

/**
 *
 * @author MSI-PULSE
 */
public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] numbers) {
        // Implementación del algoritmo de BubbleSort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String getStrategyName() {
        return "Bubble Sort";
    }
}