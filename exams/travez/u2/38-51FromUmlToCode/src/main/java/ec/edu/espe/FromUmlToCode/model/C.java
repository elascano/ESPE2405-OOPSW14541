/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.FromUmlToCode.model;

import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author G406
 */
public class C extends A{
    private List<E> eList;

    public C(A a) {
        super(a);
    }
    
    public C() {
        eList = new ArrayList<>();
    }

    public void addE(E e) {
        if (eList.size() < 3) {
            eList.add(e);
        }
    }

    public List<E> getEList() {
        return eList;
    }
}
