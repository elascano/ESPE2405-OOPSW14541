package ec.edu.espe.q28_51.model;

/**
 *
 * @author SARAY CANARTE
 */
public class C extends A {
    private E e;

    public C(E e, A a) {
        super(a);
        this.e = e;
    }

    /**
     * @return the e
     */
    public E getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(E e) {
        this.e = e;
    }
}
