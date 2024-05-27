
package ec.edu.espe.farmsimulator.model;

import java.util.Date;

/**
 *
 * @author Nahomi Cedeno;CODE CREATORS;OOP
 */
public class ChickenFarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nahomi Chicken Farm Simulator V8.5");
        
        Chicken chicken = new Chicken(1,"Lucy", "white and Brown",1, false, 1);
        System.out.println("Chicken --> \n"+ chicken);
    
    int id=2;
    String name="Maruja"; 
    String color="black";
    int age=1;
    boolean molting= false;
    Date bornOnDate= new Date();
    
    
    chicken = new Chicken(id, name, color, age, molting, bornOnDate);
        System.out.println("Chicken 2--> \n"+ chicken);
    }
    
}
