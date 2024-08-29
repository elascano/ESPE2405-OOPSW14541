/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.composite.model;

/**
 *
 * @author Enzo Armijos, LogicLegion, DCCO-ESPE
 */
public class Clerk extends Employee {
    public Clerk(String aName){
        this();
        name = aName;
    }
    
    public void stateName(){
        super.stateName();
    };
    
    public Clerk(){
        title = "Clerk";
    }
}
