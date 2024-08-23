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
 * author of the insert sort algorithm
 * @author <a href='mailto:alexey@zhokhov.com'>Alexey Zhokhov</a>
 */
public class InsertionSort extends SortingStrategy {

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int array[], int startIndex, int endIndex) {
        if (endIndex - startIndex >= 1) {
            int rightIndex = partition(array, startIndex, endIndex);

            quickSort(array, startIndex, rightIndex - 1);

            quickSort(array, rightIndex + 1, endIndex);
        }
    }

    private int partition(int array[], int startIndex, int endIndex) {
        int leftIndex = startIndex;

        int rightIndex = endIndex;

        int pivot = array[startIndex];

        while (rightIndex > leftIndex) {
            while (array[leftIndex] <= pivot && leftIndex <= endIndex && rightIndex > leftIndex) {
                leftIndex++;
            }

            while (array[rightIndex] > pivot && rightIndex >= startIndex && rightIndex >= leftIndex) {
                rightIndex--;
            }

            if (rightIndex > leftIndex) {
                swap(array, leftIndex, rightIndex);
            }
        }

        swap(array, startIndex, rightIndex);

        return rightIndex;
    }

    private void swap(int array[], int index1, int index2) {
        int temp = array[index1];

        array[index1] = array[index2];
        array[index2] = temp;
    }
}
