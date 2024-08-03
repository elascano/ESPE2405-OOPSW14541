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
public class A {
    private List<Object> components = new ArrayList<>();

    public void addComponent(Object component) {
        components.add(component);
    }

    @Override
    public String toString() {
        return "A with components: " + components;
    }
}
