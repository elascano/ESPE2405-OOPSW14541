/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromumltocode.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G406
 */
public class D extends A {
    private List<D> dList = new ArrayList<>();
    private F f;

    public void addD(D d) {
        dList.add(d);
    }

    public void setF(F f) {
        this.f = f;
    }
    
}
