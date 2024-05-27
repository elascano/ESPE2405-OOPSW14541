
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;
/**
 *
 * @author Kenny Gavilanez, The Javas, DCCO-ESPE
 */
public class FarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Kenny's Chicken Farm Simulator V 0.5");
        Chicken chicken = new Chicken(1, "Lucy", "White and brown",0, true, new Date());
        System.out.println("Chicken ---> \n" + chicken);
        
        int id=2;
        String name="Maruja";
        String color="black";
        int age=1;
        boolean molting = false;
        Date bornOnDate = new Date();
        
        chicken = new Chicken(id, name, color, age, molting, bornOnDate);
        System.out.println("Chicken 2 ---> \n" + chicken);
    }
    
}
