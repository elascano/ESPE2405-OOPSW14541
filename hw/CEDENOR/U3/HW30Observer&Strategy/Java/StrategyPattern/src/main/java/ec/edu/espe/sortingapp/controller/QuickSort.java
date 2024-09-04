package ec.edu.espe.sortingapp.controller;

/**
 *
 * @author Nahomi Cedeño, codecreators, DCCO - ESPE
 * using some algorithm logic from Shakhzod Yuld https://github.com/soloShak/Java-Sorting-app.git
 */
public class QuickSort implements SortingStrategy {
    @Override
    public int[] sort(int[] data) {
        swap(data, 0, data.length - 1);
        return data;
    }

    private void swap(int[] data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);
            swap(data, low, pi - 1);
            swap(data, pi + 1, high);
        }
    }

    private int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (data[j] <= pivot) {
                i++;

                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }
}
