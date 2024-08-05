/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author G406
 */
public class B extends A implements H{
    private B b;
    
    public static void r(){
        
    }

    @Override
    public String toString() {
        return "B{" + "b=" + b + '}';
    }

    public B(B b, A a) {
        super(a);
        this.b = b;
    }

    public B(A a) {
        super(a);
    }

    /**
     * @return the b
     */
    public B getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(B b) {
        this.b = b;
    }
}
