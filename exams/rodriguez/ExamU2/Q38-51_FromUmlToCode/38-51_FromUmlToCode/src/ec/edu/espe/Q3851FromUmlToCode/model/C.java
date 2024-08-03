/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Q3851FromUmlToCode.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G400
 */
public class C extends A {
    private List<E> eObjects = new ArrayList<>();

    public void addE(E e) {
        eObjects.add(e);
    }

    @Override
    public String toString() {
        return "C with E objects: " + eObjects;
    }
}

