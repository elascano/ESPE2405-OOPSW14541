/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypattern.controller;
import ec.edu.espe.strategypattern.view.SortingStrategy;
import ec.edu.espe.strategypattern.view.SortingApp;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class SortingController {
        public void sortAndDisplay(int[] numbers, SortingApp app) {
        SortingContext context = new SortingContext();
        int[] sortedNumbers = context.sort(numbers);

        
        String sortMethod = getSortingMethod(numbers.length);
        app.displaySortedNumbers(sortedNumbers, sortMethod);
    }

    private String getSortingMethod(int size) {
        if (size > 0 && size < 30) {
            return "Bubble Sort";
        } else if (size >= 30 && size < 100) {
            return "Insertion Sort";
        } else {
            return "Quick Sort";
        }
    }
    
}

