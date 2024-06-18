
package ec.edu.espe.view;

import ec.edu.espe.ir.model.Person;
import java.util.Scanner;

/**
 *
 * @author Nahomi Cedeño, CODE CREATORS, DCCO-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el sueldo mensual de la persona: ");
        double sueldoMensual = scanner.nextDouble();

        Person person = new Person(nombre, sueldoMensual);

        System.out.println("Ingreso anual: " + person.getIngresoAnual());
        System.out.println("Impuesto a la renta: " + person.getImpuestoRenta());

        System.out.print("Desea calcular el impuesto a la renta para otro sueldo mensual? (si/no): ");
        String respuesta = scanner.next();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.print("Ingrese el nuevo sueldo mensual: ");
            sueldoMensual = scanner.nextDouble();
            person.setSueldoMensual(sueldoMensual);
            System.out.println("Ingreso anual: " + person.getIngresoAnual());
            System.out.println("Impuesto a la renta: " + person.getImpuestoRenta());
        }
    }
}

    