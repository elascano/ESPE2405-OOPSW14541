
package ec.edu.espe.compositepattern.controller;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class Manager extends Supervisior{
    public Manager(String aName){
        this();
        name = aName;
    }
    
    public Manager(){
        super();
        title = "Manager";
    }
    
    public void stateName(){
        super.stateName();
    }
}
