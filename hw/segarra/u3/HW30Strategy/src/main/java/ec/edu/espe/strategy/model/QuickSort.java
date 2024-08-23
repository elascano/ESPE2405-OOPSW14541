/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategy.model;

import ec.edu.espe.strategy.controller.SortingStrategy;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 *
 * author of the quick sort algorithm
 * @author <a href='mailto:alexey@zhokhov.com'>Alexey Zhokhov</a>
 */
public class QuickSort extends SortingStrategy {

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
