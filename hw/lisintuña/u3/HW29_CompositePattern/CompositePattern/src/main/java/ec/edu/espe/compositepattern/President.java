
package ec.edu.espe.compositepattern;

/**
 *
 * @author Cristian Lisintuña
 */
public class President extends Supervisior{
    private static President president = new President();
    
    private President(String aName){
        this();
        name = aName;
    }
    
    private President(){
        super();
        title = "President";
    }
    
    public void stateName(){
        super.stateName();
    }
    
    public static President getPresident(String aName){
        president.name = aName;
        return President.president;
    }
}
