package ec.edu.espe.event.hw29compositepattern;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class Manager extends Supervisor{
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
