
package ec.edu.espe.compositepattern.controller;
/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
abstract class Employee {
    public static String name = "Not assigned yet";
    public static String title = "Not assigned yet";
    
    public void stateName(){
        System.out.println(title + " " + name);
    }
}

