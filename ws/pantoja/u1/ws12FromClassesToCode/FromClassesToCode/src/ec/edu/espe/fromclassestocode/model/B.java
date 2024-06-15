
package ec.edu.espe.fromclassestocode.model;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class B {
    private float f;
    private C cs[] = new C[10];

     public B(float f, C[] cs) {
        this.f = f;
        this.cs = cs;
    }
 
 
    @Override
    public String toString() {
        return "B{" + "f=" + getF() + ", cs=" + getCs() + '}';
    }

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
     * @return the cs
     */
    public C[] getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(C[] cs) {
        this.cs = cs;
    }
    
    

 
    
}
