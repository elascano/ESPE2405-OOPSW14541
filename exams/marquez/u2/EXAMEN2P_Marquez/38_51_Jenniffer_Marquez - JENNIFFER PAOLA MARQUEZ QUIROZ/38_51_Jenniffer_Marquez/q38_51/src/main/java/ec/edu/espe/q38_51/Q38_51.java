package ec.edu.espe.q38_51;

import ec.edu.espe.q38.model.*;
import static ec.edu.espe.q38.model.G.useJ;

/**
 * @author Jenniffer Marquez, JavaSquad, DCCO-ESPE
 */
public class Q38_51 {

    public static void main(String[] args) {
        
        A a = new A(new A());
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E(); 
        F f = new F(); 
        G g = new G(); 
        H h = new G(); 
        J j = new J(); 
        
        useJ(j);

        System.out.println("A ---->" + a);
        System.out.println("B ---->" + b);
        System.out.println("C ---->" + c);
        System.out.println("D ---->" + d);
        System.out.println("E ---->" + e);
        System.out.println("F ---->" + f);
        System.out.println("G ---->" + g);
        System.out.println("H ---->" + h);
        System.out.println("J ---->" + j);
    }
}
