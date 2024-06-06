/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.FromClassesToCode.view;

import ec.edu.espe.FromClassesToCode.model.*;
import java.util.ArrayList;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class FromClassesToCode {
    public static void main(String[] args) {
        C c;
        D d;
        E e;
        B b;
        A a;
        ArrayList<C> cs = new ArrayList<>();
        C otherCs[] = new C[10];
        
        c = new C();
        d = new D();
        
        cs.add(c);
        cs.add(new C());
        cs.add(c);
        
        b = new B(0.20F, otherCs);
        e = new E(cs);
        
        a = new A(1, b);
        
        System.out.println("d --> " + d);
        System.out.println("c --> " + c);
        System.out.println("e --> " + e);
        System.out.println("b --> " + b);
        
        System.out.println("a --> " + a);
        
        System.out.println("running a method --> " + a.m(d));
        
        cs.forEach((otherC) -> System.out.println(otherC));
    }
}
