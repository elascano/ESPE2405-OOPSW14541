package ec.edu.espe.fromclassestocode.model;

/**
 *
 * @author David Morillo, JavaSquad, DCCO-ESPE
 */
public class A {
    private int i; 
    private B b;

    public A(int i, B b) {
        this.i = i;
        this.b = b;
    }
    
    public C m(D d){
        C c = new C();
        return c;
    }

    @Override
    public String toString() {
        return "A{" + "i=" + i + ", b=" + b + '}';
    }
    
    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
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
