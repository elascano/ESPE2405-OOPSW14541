
package ec.edu.espe.q28_51.model;

/**
 *
 * @author SARAY CANARTE
 */
public class A {
    private A a;

    public A(A a) {
        this.a = a;
    }
    public void aMethod(){
        System.out.println("this is class A" + getA());
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
