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
public class D extends A {
    private List<F> fObjects = new ArrayList<>();

    public void addF(F f) {
        fObjects.add(f);
    }

    @Override
    public String toString() {
        return "D with F objects: " + fObjects;
    }
}

