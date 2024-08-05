/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.view;

import ec.edu.espe.model.B;
import ec.edu.espe.model.C;
import ec.edu.espe.model.D;
import ec.edu.espe.model.E;
import ec.edu.espe.model.F;
import ec.edu.espe.model.G;
import ec.edu.espe.model.J;

/**
 *
 * @author G406
 */
public class Menu {
    public static void main(String[] args) {
        
        E e1 = new E();
        E e2 = new E();
        E e3 = new E();
        F f1 = new F();
        J j1 = new J();
        G g1 = new G(j1);

        
        C c = new C();
        c.addE(e1);
        c.addE(e2);
        c.addE(e3);

        
        D d = new D(f1);
        d.addE(e1);
        d.addE(e2);
        d.addE(e3);

        
        B b = new B();
        b.addH(g1);

        
        System.out.println("Instancia de C contiene: " + c.getEList());
        System.out.println("Instancia de D contiene: " + d.getEList() + " y F: " + d.getF());
        System.out.println("Instancia de B contiene: " + b.getHList());

        
        g1.performAction();
    }
}
