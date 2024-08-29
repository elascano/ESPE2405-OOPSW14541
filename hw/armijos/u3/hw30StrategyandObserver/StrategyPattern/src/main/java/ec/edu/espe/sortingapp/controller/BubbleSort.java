package ec.edu.espe.sortingapp.controller;

/**
 *
 * @author Enzo Armijos, LogicLegion, DCCO-ESPE
 */
public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, i, j);
                }
            }
        }
        return data;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
    
}
