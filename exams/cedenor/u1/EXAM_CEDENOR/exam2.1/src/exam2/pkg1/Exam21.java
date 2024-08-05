/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam2.pkg1;

/**
 *
 * @author G406
 */
public class Exam21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         A a = new A();
        B b1 = new B();
        B b2 = new B();
        C c1 = new C();
        E e1 = new E();
        D d1 = new D();
        F f1 = new F();
        G g1 = new G();
        J j1 = new J();

        // Establecer relaciones
        a.addB(b1);
        a.addB(b2);
        c1.addE(e1);
        d1.setF(f1);

        // Mostrar relaciones
        System.out.println("A tiene " + a.getBCount() + " instancias de B.");
        System.out.println("C tiene " + c1.getECount() + " instancias de E.");
        System.out.println("D tiene F instancia: " + (d1.getF() != null ? "Sí" : "No") + ".");
    }
}
    

