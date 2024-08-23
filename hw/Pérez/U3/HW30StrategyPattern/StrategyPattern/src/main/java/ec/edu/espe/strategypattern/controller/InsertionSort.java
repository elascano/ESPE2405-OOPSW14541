package ec.edu.espe.strategypattern.controller;

import ec.edu.espe.strategypattern.view.SortingStrategy;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
// Implementation of Insertion Sort algorithm
// Source: "codigofacilito", "Ordenamiento por Inserción (Insertion Sort) en Java", Youtube
// URL: https://www.youtube.com/watch?v=O4iuk9VhqYs
// Accessed on: 22/08/2024
public class InsertionSort implements SortingStrategy {
    public int[] sort(int data[]){
        int aux, cont1, cont2;
        for(cont1=1;cont1<data.length;cont1++){
            aux=data[cont1];
            for(cont2=cont1-1;cont2>=0 && data[cont2]>aux;cont2--){
                data[cont2+1]=data[cont2];
                data[cont2]=aux;
            }
        }
        return data;
    }
}
