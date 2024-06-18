/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.IR.view;

import java.util.Scanner;
import ec.edu.espe.IR.model.Persona;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el salario de la persona: ");
        double salario = scanner.nextDouble();

        Persona persona = new Persona(nombre, salario);

        double impuestoRenta = persona.calcularImpuestoYActualizarSalario();

    
        System.out.println("\nResumen:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Impuesto a la renta: $" + impuestoRenta);
        System.out.println("Salario después de impuestos: $" + persona.getSalario());
    }
}
