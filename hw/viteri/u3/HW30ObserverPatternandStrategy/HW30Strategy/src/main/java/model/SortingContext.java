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
public class SortingContext {
    private SortingStrategy ss;
    
    public void sort(int data[]){
        int size = data.length;
        ss = setSortStrategy(size);
        ss.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int size){
        if(size > 0 && size < 30){
            System.out.println("\nSorting with the bubble algorithm");
            return new BubbleSort();
            
        } else if(size >= 30 && size < 100){
            System.out.println("\nSorting with the insetion algorithm");
            return new InsertionSort();
            
        }else if(size >= 100){
            System.out.println("\nSorting with the quick algorithm");
            return new QuickSort();
            
        }
        return null;
    }
}