
package ec.edu.espe.fromumltocode.model;


/**
 *
 * @author Marcelo Acuña 
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
        return "A{" + "a=" + a + '}';
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
