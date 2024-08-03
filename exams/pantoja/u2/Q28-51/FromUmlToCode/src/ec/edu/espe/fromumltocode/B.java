/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromumltocode;

/**
 *
 * @author G406
 */
public class B extends A {
    private H h;

    public B(String nombre, G h) {
        super(nombre);
        this.h = h;
    }

    public void setH(H h) {
        this.h = h;
    }

    public H getH() {
        return h;
    }

    @Override
    public String toString() {
        return "Clase B: " + getNombre() + ", H: " + h.toString();
    }
}

