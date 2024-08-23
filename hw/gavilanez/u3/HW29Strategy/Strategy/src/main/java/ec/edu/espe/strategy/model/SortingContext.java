
package ec.edu.espe.strategy.model;

import ec.edu.espe.strategy.controller.SortingStrategy;
import ec.edu.espe.strategy.model.*;
/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
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