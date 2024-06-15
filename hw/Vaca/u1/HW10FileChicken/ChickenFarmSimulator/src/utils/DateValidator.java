/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.time.LocalDate;
import java.util.Scanner;

public class DateValidator {

    public static LocalDate getValidDate() {
        Scanner scanner = new Scanner(System.in);
        int year, month, day;

        while (true) {
            try {
                System.out.println("Enter the birth year of the chicken: ");
                year = Integer.parseInt(scanner.nextLine());
                if (year > LocalDate.now().getYear()) {
                    throw new IllegalArgumentException("The year can't be higher than the current year.");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter the birth month of the chicken (1-12): ");
                month = Integer.parseInt(scanner.nextLine());
                if (month < 1 || month > 12) {
                    throw new IllegalArgumentException("The month has to be between 1 and 12.");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter the birth day of the chicken: ");
                day = Integer.parseInt(scanner.nextLine());
                if (day < 1 || day > 31) {
                    throw new IllegalArgumentException("The day has to be between 1 and 31.");
                }

                LocalDate birthDate = LocalDate.of(year, month, day);
                return birthDate;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

