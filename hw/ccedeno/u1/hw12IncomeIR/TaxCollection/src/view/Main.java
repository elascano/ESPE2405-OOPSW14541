
package view;

import java.util.Scanner;
import model.Person;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su nombre:");
        String name = scanner.nextLine();
        System.out.println("ingrese su suledo");
        float sueldo = scanner.nextFloat();
        float sueldoAnual = 12 * sueldo;
        
        
        Person person;
        
        person = new Person(name,sueldo,0,sueldoAnual,0);
        System.out.println("persona -->" +person);
    }
    
}
