
package ec.edu.espe.strategy.model;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class QuickSort extends SortingContext {

    public QuickSort() {
    }
    @Override
    public void sort(int[] array) {
        for (int index = 1; index < array.length; index++) {
            insert(array, index);
        }
    }

    private void insert(int array[], int currentIndex) {
        int value = array[currentIndex];

        int reverseIndex = currentIndex;

        for (int i = currentIndex - 1; i >= 0; i--) {

            if (array[i] >= value) {
                array[i + 1] = array[i];
                reverseIndex = i;

            } else {
                break;
            }
        }

        array[reverseIndex] = value;
    }
}
