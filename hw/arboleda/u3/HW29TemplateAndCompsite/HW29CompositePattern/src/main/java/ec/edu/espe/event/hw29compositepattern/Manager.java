package ec.edu.espe.event.hw29compositepattern;

/**
 *
 * @author Abner Arboleda, LogicLegion, DCCO-ESPE
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
