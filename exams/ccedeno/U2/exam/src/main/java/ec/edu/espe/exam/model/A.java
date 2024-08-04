
package ec.edu.espe.exam.model;


/**
 *
 * @author Andres Cedeno, Code Creators, DCCO-ESPE
 *
 */
public class A { 
    private A a; 
    public A(){
    
    }

    public A(A a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "A{" + "a:  " + a + '}';
    }
    
    /**
     * @return the a
     */
    public A getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(A a) {
        this.a = a;
    }

}
