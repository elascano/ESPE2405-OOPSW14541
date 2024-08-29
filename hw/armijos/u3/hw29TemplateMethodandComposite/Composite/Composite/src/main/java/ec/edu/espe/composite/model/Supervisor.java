/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.composite.model;

import java.util.Vector;

/**
 *
 * @author Enzo Armijos, LogicLegion, DCCO-ESPE
 */
public abstract class Supervisor extends Employee {
    protected Vector directReports = new Vector();
    
    public void stateName(){
        super.stateName();
        if(directReports.size() > 0)
            for(int i = 0; i < directReports.size(); i++)
                ((Employee)directReports.elementAt(i)).stateName();
    }
    
    public void add(Employee anEmployee){
        this.directReports.addElement(anEmployee);
    }
}
