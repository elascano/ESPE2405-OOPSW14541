
package ec.edu.espe.strategy.model;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class BubbleSort extends SortingContext{

    public BubbleSort() {
    }
    @Override
    public void sort(int[] array) {
        for (int reverseIndex = array.length - 1; reverseIndex > 1; reverseIndex--) {

            for (int i = 0; i < reverseIndex; i++) {

                if (array[i] > array[i + 1]) {
                    int temp = array[i];

                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }
            }
        }

    }
}
