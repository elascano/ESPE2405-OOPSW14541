package ec.edu.espe.q38.model;

import java.util.ArrayList;

/**
 * @author Jenniffer Marquez, JavaSquad, DCCO-ESPE
 */
public class D extends A {
    private E[] e;
    private ArrayList<F> f;

   
    public D() {
       
        this.e = new E[5]; 
        this.f = new ArrayList<>();
    }

    
    public D(ArrayList<F> f, A a) {
        super(a);
        this.f = f != null ? f : new ArrayList<>(); 
        this.e = new E[5]; 
    }

    @Override
    public String toString() {
        return "D{" + "e=" + java.util.Arrays.toString(e) + ", f=" + f + '}';
    }

    
    public E[] getE() {
        return e;
    }

    
    public void setE(E[] e) {
        this.e = e != null ? e : new E[5]; 
    }

    
    public ArrayList<F> getF() {
        return f;
    }

   
    public void setF(ArrayList<F> f) {
        this.f = f != null ? f : new ArrayList<>(); 
    }
}
