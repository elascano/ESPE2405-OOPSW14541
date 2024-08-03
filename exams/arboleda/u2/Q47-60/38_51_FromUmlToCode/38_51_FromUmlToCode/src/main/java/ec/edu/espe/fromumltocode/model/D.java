
package ec.edu.espe.fromumltocode.model;

import java.util.ArrayList;


/**
 *
 * @author Abner Arboleda, LogicLegion, DCCO-ESPE 
 *
 */
public class D extends A{
    private ArrayList<F> f;
    private E[] e;
    
    public D(){
    
    }

    public D(ArrayList<F> f, E[] e) {
        this.f = f;
        this.e = e;
    }

    public D(ArrayList<F> f, E[] e, A a) {
        super(a);
        this.f = f;
        this.e = e;
    }

    @Override
    public String toString() {
        return "D{" + "f=" + getF() + '}';
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

    /**
     * @return the e
     */
    public E[] getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(E[] e) {
        this.e = e;
    }
    
    
    
}