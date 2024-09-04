
package ec.edu.espe.event.hw29compositepattern;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
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
