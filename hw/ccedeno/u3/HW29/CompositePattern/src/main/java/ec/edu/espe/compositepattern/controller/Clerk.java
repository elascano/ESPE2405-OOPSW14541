
package ec.edu.espe.compositepattern.controller;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class Clerk extends Employee{
    public Clerk(String aName){
        this();
        name = aName;
    }
    
    public void stateName(){
        super.stateName();
    }
    
    public Clerk(){
        title = "Clerk";
    }
}

