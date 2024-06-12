/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.input;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Jenniffer Marquez, Javasquad, DCCO-ESPE
 */
public class ChickenInput {
    public static Chicken enterChickenData() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter chicken data:");

        int id = validatePositiveInt(scanner, "ID (must be a positive integer): ");
        
        // Consumir el salto de línea después de leer el ID
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        String color = validateColorInput(scanner, "Color: ");

        Date bornOnDate = null;
        while (bornOnDate == null || bornOnDate.after(new Date())) {
            System.out.print("Enter born on date (dd/MM/yyyy, must be before or equal to today's date): ");
            String dateInput = scanner.nextLine();
            try {
                bornOnDate = dateFormat.parse(dateInput);
                if (bornOnDate.after(new Date())) {
                    System.out.println("Date must be before or equal to today's date.");
                }
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter date in format dd/MM/yyyy.");
            }
        }

        // Calculate age based on born on date
        int age = calculateAge(bornOnDate);

        boolean molting = validateBooleanInput(scanner, "Is molting? (true/false): ");

        return new Chicken(id, name, color, age, molting, bornOnDate);
    }

    private static int validatePositiveInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // Consume invalid input
            }
        }
        return value;
    }

    private static int calculateAge(Date bornOnDate) {
        if (bornOnDate == null) {
            return 0;
        }

        Calendar bornDateCalendar = Calendar.getInstance();
        bornDateCalendar.setTime(bornOnDate);
        Calendar currentDateCalendar = Calendar.getInstance();

        int yearsDifference = currentDateCalendar.get(Calendar.YEAR) - bornDateCalendar.get(Calendar.YEAR);
        bornDateCalendar.add(Calendar.YEAR, yearsDifference);

        if (currentDateCalendar.before(bornDateCalendar)) {
            yearsDifference--;
        }

        return yearsDifference;
    }

    private static boolean validateBooleanInput(Scanner scanner, String prompt) {
        boolean value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextBoolean()) {
                value = scanner.nextBoolean();
                break;
            } else {
                System.out.println("Please enter either 'true' or 'false'.");
                scanner.next(); // Consume invalid input
            }
        }
        return value;
    }

    private static String validateColorInput(Scanner scanner, String prompt) {
        String color;
        while (true) {
            System.out.print(prompt);
            color = scanner.nextLine();
            if (color.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("Please enter a valid color (letters only).");
            }
        }
        return color;
    }
}