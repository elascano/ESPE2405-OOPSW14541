/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fromclasesstocode.view;

import ec.edu.espe.fromclassestocode.model.*;
import java.util.ArrayList;


/**
 *
 * @author Simone Medina, JavaSquad, DCCO-ESPE
 */
public class FromClassestoCode {
    public static void main(String[] args) {
        A a;
        B b;
        C c;
        D d;
        E e;
        ArrayList<C> cs = new ArrayList<>();
        C otherCs[] = new C[10];
                
        c = new C();
        d = new D();
        
        cs.add(c);
        cs.add(new C());
        cs.add(c);
        
        otherCs [1] = c;
        
        b = new B(0.1F, otherCs);
        e = new E(cs);
        a = new A(1, b);
        
        System.out.println("d----> " + d);
        System.out.println("c ---> " + c);
        System.out.println("e ---> " + e);
        
        System.out.println("b --> " + b);
        System.out.println("a ---> " + a);
        
        System.out.println("running a method --> " + a.m(d));
        
        cs.forEach((otherC) -> System.out.println(otherC));
        
        
        
    }
}
