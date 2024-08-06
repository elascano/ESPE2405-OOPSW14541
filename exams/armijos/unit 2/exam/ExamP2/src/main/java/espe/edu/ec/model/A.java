/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.model;

/**
 *
 * @author G406
 */
public class A {
    
    private A subA;
    private B b;
    private C c;
    private D d;

    public A() {
        subA = null; 
    }
    
    public void setSubA(A subA) {
        this.subA = subA;
    }
    
    public void setB(B b) {
        this.b = b;
    }
    
    public void setC(C c) {
        this.c = c;
    }
    
    public void setD(D d) {
        this.d = d;
    }
}
