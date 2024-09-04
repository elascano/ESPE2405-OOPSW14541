
package ec.edu.espe.event.hw29compositepattern;

import java.util.Vector;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
abstract class Supervisior extends Employee{
    protected Vector directReports = new Vector();
    
    public void stateName(){
        super.stateName();
        if(directReports.size() > 0){
            for(int i=0; i < directReports.size(); ++i){
                ((Employee)directReports.elementAt(i)).stateName();
            }
        }
    }
    
    public void add(Employee anEmployee){
        this.directReports.addElement(anEmployee);
    }
}
