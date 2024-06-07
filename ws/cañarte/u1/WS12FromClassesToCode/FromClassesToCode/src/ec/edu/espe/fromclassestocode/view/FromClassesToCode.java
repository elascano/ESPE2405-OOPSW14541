
package ec.edu.espe.fromclassestocode.view;
import ec.edu.espe.fromclassestocode.model.*;
import java.util.ArrayList;

/**
 *
 * @author Saray Canarte, Code Creators. DCCO - ESPE
 */
public class FromClassesToCode {
    public static void main (String []args){
        A a;
        B b;
        C c;
        D d;
        E e;
        
        
        ArrayList <C> cs = new ArrayList <> ();
        C otherCs [] = new C[10];
        c = new C();
        d = new D();
        
        cs.add(c);
        cs.add(new C());
        cs.add (c);
        
        b = new B(0.1F, otherCs);
        e = new E(cs);
        
        a= new A(1,b);
        System.out.println("d-->" +d);
        System.out.println("c-->"+c);
        System.out.println("e-->"+e);
        System.out.println("b-->"+b);
        System.out.println("a-->"+a);
        
      System.out.println("running a method --> " + a.m(d));
        
       cs.forEach((otherC) -> System.out.println(otherC));
        
        
    }
           
}
