/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q28_51.model;

/**
 *
 * @author SARAY CANARTE
 */
public class D extends A{
    private F f;
    private E e;

    public D(F f, E E, A a) {
        super(a);
        this.f = f;
        this.e = E;
    }

    /**
     * @return the f
     */
    public F getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(F f) {
        this.f = f;
    }

    /**
     * @return the E
     */
    public E getE() {
        return e;
    }

    /**
     * @param E the E to set
     */
    public void setE(E E) {
        this.e = E;
    }
}
