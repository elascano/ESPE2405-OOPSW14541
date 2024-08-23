package ec.edu.espe.strategypattern.controller;
import ec.edu.espe.strategypattern.view.SortingStrategy;
import java.util.Scanner;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
// Implementation of Bubble Sort algorithm
// Source: "codigofacilito", "Ordenamiento de Burbuja (Bubble Sort) en Java", Youtube
// URL: https://www.youtube.com/watch?v=NVuQWFYlXm8
// Accessed on: [22/08/2024]
public class BubbleSort implements SortingStrategy{
    public int[] sort(int data[]){
        int aux;
        boolean changes = false;
        while(true){
            changes=false;
            for (int i=1;i<data.length;i++){
                if(data[i]<data[i-1]){
                    aux=data[i];
                    data[i]=data[i-1];
                    data[i-1]=aux;
                    changes=true;
                }
            }
            if(changes==false){
                break;
            }
                
        }
        return data;
    }
    
}
