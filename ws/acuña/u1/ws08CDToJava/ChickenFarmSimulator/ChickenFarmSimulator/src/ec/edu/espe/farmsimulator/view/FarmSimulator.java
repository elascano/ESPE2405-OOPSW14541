package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE}
 */
public class FarmSimulator {
    public static void main(String[] args) {
        System.out.println("Marcelo´s Chicken Farm Simulator V0.5"); 
        Chicken chicken = new Chicken(1, "Lucy", "brown", 0, true, new Date());
        System.out.println("Chicken -->\n" + chicken);
        
        int id=2;
        String name="Maruja";
        String color="black";
        int age=1;
        boolean molting = false;
        Date bornOnDate = new Date();
        
    chicken = new Chicken (id, name, color, age, true, bornOnDate);
    System.out.println("Chicken2 -->\n" + chicken);
            
    }
    
}
