package ec.edu.espe.strategy.controller;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sortData(int[] data) {
        
        int n = data.length;
        int[] lowHigh = determinateLowAndHigh(data, n);
        data = quickSort(data, lowHigh[0], lowHigh[1]);

        return data;
    }

    static int[] determinateLowAndHigh(int[] data, int n) {
        int low = 0;
        int high = 0;

        for (int i = 1; i < n; i++) {
            if (data[i] > high) {
                high = data[i];
            }
            if (data[i] < low) {
                low = data[i];
            }
        }
        
        int[] lowHigh={low, high};
        return lowHigh;
    }

    static int[] quickSort(int[] data, int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(data, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
        return data;
    }

    static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    static int partition(int[] data, int low, int high) {
        // Choosing the pivot
        int pivot = data[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (data[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(data, i, j);
            }
        }
        swap(data, i + 1, high);
        return (i + 1);
    }

}
