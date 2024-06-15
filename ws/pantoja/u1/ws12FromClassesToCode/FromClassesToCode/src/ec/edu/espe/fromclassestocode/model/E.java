
package ec.edu.espe.fromclassestocode.model;

import java.util.ArrayList;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class E {
    private ArrayList <C> cs;

    public E(ArrayList<C> cs) {
        this.cs = cs;
    }

    @Override
    public String toString() {
        return "E{" + "cs=" + cs + '}';
    }
    
    

    /**
     * @return the cs
     */
    public ArrayList <C> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList <C> cs) {
        this.cs = cs;
    }
    
}
