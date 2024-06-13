/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromclassestocode.model;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class B {
    private float f;
    private C cs[] = new C[10];

    /**
     * @return the f
     */
    public float getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(float f) {
        this.f = f;
    }

    /**
     * @return the c
     */
    public C[] getC() {
        return cs;
    }

    /**
     * @param c the c to set
     */
    public void setC(C[] c) {
        this.cs = cs;
    }

    public B(float f, C[] otherCs) {
        this.f = f;
    }

    @Override
    public String toString() {
        return "B{" + "f=" + f + ", cs=" + cs + '}';
    }
    
}
