/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.SortingStrategy;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class BubbleSort extends SortingStrategy {

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