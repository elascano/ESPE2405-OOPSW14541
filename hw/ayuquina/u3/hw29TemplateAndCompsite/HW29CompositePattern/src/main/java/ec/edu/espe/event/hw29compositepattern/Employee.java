
package ec.edu.espe.event.hw29compositepattern;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
abstract class Employee {
    public static String name = "Not assigned yet";
    public static String title = "Not assigned yet";
    
    public void stateName(){
        System.out.println(title + " " + name);
    }
}
