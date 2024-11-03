
package ec.edu.espe.compositepattern;

/**
 *
 * @author Cristian Lisintuña
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
