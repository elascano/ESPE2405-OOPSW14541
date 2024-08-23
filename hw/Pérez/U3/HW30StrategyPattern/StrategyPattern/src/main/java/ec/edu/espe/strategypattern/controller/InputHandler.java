/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypattern.controller;
import java.util.Scanner;
/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class InputHandler {
        public void sortAndDisplay() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        int data[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);

        System.out.println("Sorted list:");
        for (int num : sortedList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
