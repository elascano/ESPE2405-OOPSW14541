/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author G406
 */
public class D extends A {
    private ArrayList <D> d = new ArrayList<>(4);
    public D(A a) {
        super(a);
    }
    

    @Override
    public String toString() {
        return "D{" + "d=" + d + '}';
    }

    public D(ArrayList<D> d, A a) {
        super(a);
        this.d = d;
    }

    /**
     * @return the d
     */
    public ArrayList <D> getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(ArrayList <D> d) {
        this.d = d;
    }
    
}
