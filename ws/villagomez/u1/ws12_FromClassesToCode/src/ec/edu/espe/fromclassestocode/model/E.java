/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromclassestocode.model;

import java.util.ArrayList;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public class E {

    private ArrayList cs;

    @Override
    public String toString() {
        return "E{" + "cs=" + cs + '}';
    }

    public E(ArrayList cs) {
        this.cs = cs;
    }

    /**
     * @return the cs
     */
    public ArrayList getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList cs) {
        this.cs = cs;
    }

}
