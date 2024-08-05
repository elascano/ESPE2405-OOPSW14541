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
public class B extends A {
    private List<H> hObjects = new ArrayList<>();

    public void addH(H h) {
        hObjects.add(h);
    }

    @Override
    public String toString() {
        return "B with H objects: " + hObjects;
    }
}

