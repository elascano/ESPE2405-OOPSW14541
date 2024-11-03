
package ec.edu.espe.compositepattern;

/**
 *
 * @author Cristian Lisintuña
 */
abstract class Employee {
    public static String name = "Not assigned yet";
    public static String title = "Not assigned yet";
    
    public void stateName(){
        System.out.println(title + " " + name);
    }
}

