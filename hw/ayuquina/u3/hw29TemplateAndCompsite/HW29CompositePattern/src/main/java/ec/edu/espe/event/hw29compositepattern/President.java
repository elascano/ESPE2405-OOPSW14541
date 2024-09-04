
package ec.edu.espe.event.hw29compositepattern;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
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
