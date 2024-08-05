/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromumltocode;

/**
 *
 * @author G406
 */
public class D extends A {
    private F f;

    public D(String nombre, F f) {
        super(nombre);
        this.f = f;
    }

    @Override
    public String toString() {
        return "Clase D: " + getNombre() + ", F: " + f.toString();
    }
}

