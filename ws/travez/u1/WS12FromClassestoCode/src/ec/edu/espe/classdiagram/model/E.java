/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.classdiagram.model;

import java.util.ArrayList;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class E {
    
    private ArrayList<C> cs;

    public E(ArrayList<C> cs) {
        this.cs = cs;
    }

    @Override
    public String toString() {
        return "E{" + "cs=" + cs + '}';
    }
    
    
    
    
    /**
     * @return the cs
     */
    public ArrayList<C> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }
    
}
