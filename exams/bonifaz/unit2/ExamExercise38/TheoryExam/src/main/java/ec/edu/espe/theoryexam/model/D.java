
package ec.edu.espe.theoryexam.model;

import java.util.ArrayList;


/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 *
 */
public class D extends A{
    private ArrayList<F> f;
    
    public D(){
    
    }

    public D(ArrayList<F> f) {
        this.f = f;
    }

    public D(ArrayList<F> f, A a) {
        super(a);
        this.f = f;
    }

    @Override
    public String toString() {
        return "D{" + "f:  " + f + '}';
    }
    
    /**
     * @return the f
     */
    public ArrayList<F> getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(ArrayList<F> f) {
        this.f = f;
    }
    
    
    
}