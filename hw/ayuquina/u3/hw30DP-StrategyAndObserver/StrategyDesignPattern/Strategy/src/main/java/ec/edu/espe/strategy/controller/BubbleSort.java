package ec.edu.espe.strategy.controller;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class BubbleSort implements SortingStrategy {

    public BubbleSort() {
    }

    @Override
    public int[] sortData(int[] data) {

        int i, j, temp;
        boolean swapped;
        int size = data.length;
                
        for (i = 0; i < size - 1; i++) {
            swapped = false;
            for (j = 0; j < size - i - 1; j++) {
                if (data[j] > data[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false) {
                break;
            }
        }
        return data;
    }

}
