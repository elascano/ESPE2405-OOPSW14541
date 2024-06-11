
package ec.edu.espe.fromclasestocode.model;

/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
 */
public class B {
    
private float f;
    
    private C cs[]= new C[10];

    @Override
    public String toString() {
        return "B{" + "f=" + f + ", cs=" + cs + '}';
    }
    
    
    
    public B(float f, C[] cs) {
        this.f = f;
        this.cs = cs;
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
