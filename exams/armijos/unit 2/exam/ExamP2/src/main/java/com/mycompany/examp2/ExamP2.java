/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examp2;

import espe.edu.ec.model.A;
import espe.edu.ec.model.B;

/**
 *
 * @author G406
 */
import espe.edu.ec.model.E;
import espe.edu.ec.model.F;
import espe.edu.ec.model.H;
public class ExamP2 {

   public static void main(String[] args) {
        A a = new A();
        B b = new B(new G());
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
        G g = new G();
        J j = new J();
        
        
        a.setB(b);
        a.setC(c);
        a.setD(d);
        c.setE(e);
        d.setE(e);
        d.setF(f);
        
       
        b.useH();
        j.useG(g);
    }

    private static class G implements H {

        public G() {
        }
    }
}
