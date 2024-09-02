/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package view;

import model.SortingContext;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class Client {

    public static void main(String[] args) {
        int array[] = {3, 6, 4, 6, 7, 8, 5, 6, 7, 5, 3, 3};

        System.out.println("\nArray list without sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        SortingContext sortAlgorithm = new SortingContext();
        sortAlgorithm.sort(array);

        System.out.println("\nResult of the sorted array list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
