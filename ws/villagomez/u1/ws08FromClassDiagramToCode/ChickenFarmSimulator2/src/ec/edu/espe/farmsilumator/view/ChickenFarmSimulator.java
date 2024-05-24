package ec.edu.espe.farmsilumator.view;

import ec.edu.espe.farmsilumator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Domenica's Chicken Farm Simulator V. 0.5");
       
        Chicken chicken = new Chicken(1, "Lucy", "white and brown", 0, true, new Date());
        System.out.println("Chicken 1 -->\n" + chicken);
        
        int id = 2;
        String name = "Maruja";
        String color = "black";
        int age = 1;
        boolean molting = false;
        Date bornOnDate = new Date();
        
        chicken = new Chicken(id, name, color, age, molting, bornOnDate);
        System.out.println("chicken 2 --> \n" + chicken);
    }

    public ChickenFarmSimulator() {
    }
}
