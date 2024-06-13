package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.controller.FileManager;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class FarmSimualtor {
    public static void main(String[] args) {
        System.out.println("Abner's Chicken Farm");
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Solicitar datos al usuario
        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        
        scanner.nextLine(); // Limpieza del buffer

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Is molting (true/false): ");
        boolean molting = scanner.nextBoolean();

        scanner.nextLine(); // Limpieza del buffer

        System.out.print("Enter born on date (yyyy-MM-dd): ");
        String dateInput = scanner.nextLine();
        Date bornOnDate = null;
        try {
            bornOnDate = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
            return; // Salir del programa si la fecha es inválida
        }

        // Crear objeto Chicken
        Chicken chicken = new Chicken(id, name, color, age, molting, bornOnDate);
        // Mostrar
        System.out.println(chicken.toString());
        
        // Guardar los datos en un archivo de texto
        FileManager.saveToFile(chicken, "chicken_data.txt");
    }
}
