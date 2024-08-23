/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypattern.controller;

import ec.edu.espe.strategypattern.view.SortingStrategy;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
// Implementation of Quick Sort algorithm
// Source: "codigofacilito", "Ordenamiento Quicksort (Rápido!) en Java", Youtube
// URL: https://www.youtube.com/watch?v=yXy7WzgUaSA
// Accessed on: [22/08/2024]
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int data[]) {
        return quicksort(data, 0, data.length - 1);
    }

    private int[] quicksort(int[] array, int left, int right) {
        if (left >= right) {
            return array;
        }

        int pivotIndex = left;
        int i = left;
        int j = right;
        int temp;

        while (i < j) {
            while (i < j && array[j] >= array[pivotIndex]) {
                j--;
            }
            while (i < j && array[i] < array[pivotIndex]) {
                i++;
            }
            if (i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        temp = array[pivotIndex];
        array[pivotIndex] = array[i];
        array[i] = temp;

        quicksort(array, left, i - 1);
        quicksort(array, i + 1, right);

        return array;
    }
}