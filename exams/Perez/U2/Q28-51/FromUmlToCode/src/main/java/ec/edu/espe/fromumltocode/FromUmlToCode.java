/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.fromumltocode;

import ec.edu.espe.fromumltocode.model.A;
import ec.edu.espe.fromumltocode.model.B;
import ec.edu.espe.fromumltocode.model.C;
import ec.edu.espe.fromumltocode.model.D;
import ec.edu.espe.fromumltocode.model.E;
import ec.edu.espe.fromumltocode.model.F;
import ec.edu.espe.fromumltocode.model.G;
import ec.edu.espe.fromumltocode.model.J;

/**
 *
 * @author G406
 */
public class FromUmlToCode {

    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        D d1 = new D();
        E e1 = new E();
        F f1 = new F();
        G g1 = new G();
        J j1 = new J();
        
        a1.addA(a1);
        c1.addC(c1);
        d1.addD(d1);
        d1.setF(f1);

       
        g1.methodH();        
        System.out.println("Relationships created according to the class diagram.");
    }
}

