
package ec.edu.espe.q28_51.model;

/**
 *
 * @author SARAY CANARTE
 */
public class B extends A {
    private H h;
    public void bMethod(){
        System.out.println("this is B using H"+ getH());
    }

    public B(H h, A a) {
        super(a);
        this.h = h;
    }

    /**
     * @return the h
     */
    public H getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(H h) {
        this.h = h;
    }
}
