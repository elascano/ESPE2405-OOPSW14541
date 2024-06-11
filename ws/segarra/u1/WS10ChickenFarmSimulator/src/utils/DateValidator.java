/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class DateValidator {

    public static LocalDate getValidDate() {
        Scanner scanner = new Scanner(System.in);
        int year;
        int month;
        int day;

        while (true) {
            try {
                System.out.println("Enter the born year of the chicken: ");
                year = Integer.parseInt(scanner.nextLine());
                if (year > LocalDate.now().getYear()) {
                    throw new IllegalArgumentException("The year can't be higher than the current year.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry. Please type an entire number for the year.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter the born month of the chicken (1-12): ");
                month = Integer.parseInt(scanner.nextLine());
                if (month < 1 || month > 12) {
                    throw new IllegalArgumentException("The number of the month has to be between 1 and 12.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry. Please type an entire number for the month.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter the born day of the chicken: ");
                if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
                    day = Integer.parseInt(scanner.nextLine());
                    if (day < 1 || day > 31) {
                        throw new IllegalArgumentException("The number of the day has to be between 1 and 31.");
                    }

                    LocalDate birthDate = LocalDate.of(year, month, day);
                    return birthDate;
                } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
                    day = Integer.parseInt(scanner.nextLine());
                    if (day < 1 || day > 30) {
                        throw new IllegalArgumentException("The number of the day has to be between 1 and 30.");
                    }

                    LocalDate birthDate = LocalDate.of(year, month, day);
                    return birthDate;
                } else if (month == 2) {
                    day = Integer.parseInt(scanner.nextLine());
                    if (day < 1 || day > 29) {
                        throw new IllegalArgumentException("The number of the day has to be between 1 and 29.");
                    }

                    LocalDate birthDate = LocalDate.of(year, month, day);
                    return birthDate;
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid entry. Please type an entire number for the day.");
            } catch (DateTimeParseException | IllegalArgumentException e) {
                System.out.println("Invalid date. Please, type a valid combination of year, month and day.");
            }
        }

    }

    public static int getValidOption() {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            try {
                System.out.println("In what type of file you want to save this data?");
                System.out.println("0 for TXT \n1 for CSV \n2 for JSON");
                option = Integer.parseInt(scanner.nextLine());
                if (option < 0 || option > 2) {
                    throw new IllegalArgumentException("The option can't be lower than 0 or higher than 2.");
                }
                return option;
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry. Please type an entire number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
