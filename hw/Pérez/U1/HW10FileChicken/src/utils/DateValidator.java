package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateValidator {
    
    public static LocalDate getChickenBirthDate() {
        Scanner scanner = new Scanner(System.in);
        int year, month, day;
        
        while (true) {
            try {
                System.out.println("Enter the birth year of the chicken: ");
                year = Integer.parseInt(scanner.nextLine());
                if (year > LocalDate.now().getYear()) {
                    throw new IllegalArgumentException("The year cannot be greater than the current year.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for the year.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.println("Enter the birth month of the chicken (1-12): ");
                month = Integer.parseInt(scanner.nextLine());
                if (month < 1 || month > 12) {
                    throw new IllegalArgumentException("The month must be between 1 and 12.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for the month.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.println("Enter the birth day of the chicken: ");
                day = Integer.parseInt(scanner.nextLine());
                if (day < 1 || day > 31) {
                    throw new IllegalArgumentException("The day must be between 1 and 31.");
                }
                LocalDate birthDate = LocalDate.of(year, month, day);
                return birthDate;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for the day.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static int getValidOption(){
        Scanner scanner = new Scanner(System.in);
        int option;
        
        while (true) {
            try {
                System.out.println("In what type of file do you want to save this data?");
                System.out.println("1 for TXT \n2 for CSV \n3 for JSON");
                option = Integer.parseInt(scanner.nextLine());
                if (option < 1 || option > 3){
                    throw new IllegalArgumentException("The option must be between 1 and 3.");
                }
                return option;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
