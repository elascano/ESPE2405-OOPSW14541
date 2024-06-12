
import java.util.Scanner;
import static taxes.Income.computeIR;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su salario mensual: ");
        float salary = scanner.nextFloat();

        float impuesto = computeIR(salary);
        
        System.out.println("El impuesto a la renta mensual es: " + impuesto);
        scanner.close();
    }
}
