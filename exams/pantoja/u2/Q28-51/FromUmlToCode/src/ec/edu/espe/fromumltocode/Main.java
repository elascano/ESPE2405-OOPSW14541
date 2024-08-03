/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromumltocode;

/**
 *
 * @author G406
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de J y G
        System.out.print("Ingrese el nombre para J: ");
        String nombreJ = scanner.nextLine();
        J j = new J(nombreJ);

        System.out.print("Ingrese el nombre para G: ");
        String nombreG = scanner.nextLine();
        G g = new G(nombreG, j);

        // Crear una instancia de B
        System.out.print("Ingrese el nombre para B: ");
        String nombreB = scanner.nextLine();
        B b = new B(nombreB, g);

        // Crear instancias de E
        E e1 = new E("E1");
        E e2 = new E("E2");
        E e3 = new E("E3");

        // Crear una instancia de C y agregar objetos E
        System.out.print("Ingrese el nombre para C: ");
        String nombreC = scanner.nextLine();
        C c = new C(nombreC);
        c.agregarE(e1);
        c.agregarE(e2);
        c.agregarE(e3);

        // Crear una instancia de F
        System.out.print("Ingrese el nombre para F: ");
        String nombreF = scanner.nextLine();
        F f = new F(nombreF);

        // Crear una instancia de D
        System.out.print("Ingrese el nombre para D: ");
        String nombreD = scanner.nextLine();
        D d = new D(nombreD, f);

        // Imprimir los objetos
        System.out.println("\nObjetos creados:");
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());

        scanner.close();
    }
}

