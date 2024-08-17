package ec.edu.espe.q38.model;

import java.util.ArrayList;

/**
 * Clase C que extiende de A.
 * @author Jenniffer Marquez, JavaSquad, DCCO-ESPE
 */
public class C extends A {
    private ArrayList<E> e;

    
    public C() {
      
        this.e = new ArrayList<>();
    }

    
    public C(ArrayList<E> e, A a) {
        super(a);
        this.e = e != null ? e : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "C{" + "e=" + e + '}';
    }

    
    public ArrayList<E> getE() {
        return e;
    }

   
    public void setE(ArrayList<E> e) {
        this.e = e != null ? e : new ArrayList<>();
    }
}
