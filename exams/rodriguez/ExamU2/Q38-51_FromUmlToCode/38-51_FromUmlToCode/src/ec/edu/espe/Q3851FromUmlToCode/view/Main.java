/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.Q3851FromUmlToCode.view;

import ec.edu.espe.Q3851FromUmlToCode.model.A;
import ec.edu.espe.Q3851FromUmlToCode.model.B;
import ec.edu.espe.Q3851FromUmlToCode.model.C;
import ec.edu.espe.Q3851FromUmlToCode.model.D;
import ec.edu.espe.Q3851FromUmlToCode.model.E;
import ec.edu.espe.Q3851FromUmlToCode.model.F;
import ec.edu.espe.Q3851FromUmlToCode.model.G;
import ec.edu.espe.Q3851FromUmlToCode.model.J;

// Rodriguez David 
/**
 *
 * @author G400
 */
public class Main {
    public static void main(String[] args) {
        // Create instances
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        E e1 = new E("E1");
        E e2 = new E("E2");
        F f1 = new F("F1");
        F f2 = new F("F2");

        G g = new G();
        J j = new J(g);

        // Setup relationships
        c.addE(e1);
        c.addE(e2);

        d.addF(f1);
        d.addF(f2);

        b.addH(g);

        // Add components to A
        a.addComponent(b);
        a.addComponent(c);
        a.addComponent(d);

        // Display the objects
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(j);
    }
}

