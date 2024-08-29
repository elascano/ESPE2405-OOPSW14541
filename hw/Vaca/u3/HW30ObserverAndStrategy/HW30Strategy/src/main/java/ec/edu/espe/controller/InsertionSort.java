
package ec.edu.espe.controller;

/**
 *
 * @author MSI-PULSE
 */
public class InsertionSort implements SortingStrategy {
    @Override
    public void sort(int[] numbers) {
        int n = numbers.length;
        for (int i = 1; i < n; ++i) {
            int key = numbers[i];
            int j = i - 1;

            // Mueve los elementos del arreglo que son mayores que la clave a una posición adelante de su posición actual
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
    }

    @Override
    public String getStrategyName() {
        return "Insertion Sort";
    }
}
