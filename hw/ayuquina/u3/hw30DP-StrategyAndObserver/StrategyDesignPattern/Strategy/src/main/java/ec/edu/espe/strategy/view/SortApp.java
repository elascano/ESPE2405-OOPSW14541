/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.strategy.view;

import ec.edu.espe.strategy.controller.SortingContext;
import ec.edu.espe.strategy.controller.SortingStrategy;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class SortApp {

    public static void main(String[] args) {
        int data[] = {8,50,-4,8,96,5,41,32,69,54,12,1,5,4,2,3,6,9,7,8,7,4,5,6,3,2,1};
        int n = data.length;
        
        SortingContext sc = new SortingContext();
        SortingStrategy ss = sc.setSortStrategy(n);
        
        int sortedData[] = ss.sortData(data);
        
        for (int i = 0; i < n; ++i)
            System.out.print(sortedData[i] + " ");

        System.out.println();
    }
}
