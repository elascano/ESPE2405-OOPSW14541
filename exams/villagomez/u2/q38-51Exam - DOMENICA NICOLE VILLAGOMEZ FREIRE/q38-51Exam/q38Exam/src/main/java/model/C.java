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
public class C extends A {
    private ArrayList <C> c = new ArrayList<>(3); //3
    
    

    public C(A a) {
        super(a);
    }

    @Override
    public String toString() {
        return "C{" + "c=" + c + '}';
    }

    public C(ArrayList<C> c, A a) {
        super(a);
        this.c = c;
    }

    /**
     * @return the c
     */
    public ArrayList <C> getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(ArrayList <C> c) {
        this.c = c;
    }
    
}
