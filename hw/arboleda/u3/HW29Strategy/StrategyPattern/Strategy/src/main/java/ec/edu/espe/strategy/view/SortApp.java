package ec.edu.espe.strategy.view;
import ec.edu.espe.strategy.controller.SortingContext;
import ec.edu.espe.strategy.controller.SortingStrategy;

/**
 *
 * @author Abner Arboleda, LogicLegion, DCCO-ESPE
 */
public class SortApp {

    public static void main(String[] args) {
        int data[] = {50,100,25,10,6,8,4,2,1,-1,5,6,7};
        int n = data.length;
        
        SortingContext sc = new SortingContext();
        SortingStrategy ss = sc.setSortStrategy(n);
        
        int sortedData[] = ss.sortData(data);
        
        for (int i = 0; i < n; ++i)
            System.out.print(sortedData[i] + " ");

        System.out.println();
    }
}
