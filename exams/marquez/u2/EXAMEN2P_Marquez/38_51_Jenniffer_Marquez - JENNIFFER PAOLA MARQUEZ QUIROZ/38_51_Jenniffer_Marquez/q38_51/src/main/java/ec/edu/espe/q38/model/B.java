package ec.edu.espe.q38.model;

import java.util.ArrayList;

/*
 * @author Jenniffer Marquez, JavaSquad, DCCO-ESPE
 */
public class B extends A {
    private ArrayList<H> h;

   
    public B() {
        
        this.h = new ArrayList<>();
    }

    
    public B(ArrayList<H> h, A a) {
        super(a);
        this.h = h != null ? h : new ArrayList<>(); 
    }

    @Override
    public String toString() {
        return "B{" + "h=" + h + '}';
    }

    
    public ArrayList<H> getH() {
        return h;
    }

    
    public void setH(ArrayList<H> h) {
        this.h = h != null ? h : new ArrayList<>(); // Asegúrate de no establecer null
    }
}
