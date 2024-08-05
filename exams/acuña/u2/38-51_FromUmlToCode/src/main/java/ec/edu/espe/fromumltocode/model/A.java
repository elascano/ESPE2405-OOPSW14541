
package ec.edu.espe.fromumltocode.model;


/**
 *
 * @author Marcelo Acuña 
 *
 */
public class A {        //0.5 
    private A a;        //0 no hay Arralist 
    public A(){
    
    }
    // 0.2
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
