package Utils;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.YearMonth;

public class Validations {

    public static int valideInt(int lowerOption, int higherOption) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        while (true) {
            try {
                userInput = scanner.nextInt();
                if (userInput < lowerOption || userInput > higherOption) {
                    throw new IllegalArgumentException("The option can't be lower than " + lowerOption + " or higher than " + higherOption + ".");
                } else {
                    return userInput;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Please type an entire number.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int valideAnyInt() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                userInput = scanner.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Enter a INT number");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        return userInput;
    }
    
    public static int validateMonth() {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        while (true) {
            System.out.print("Enter the month (1-12): ");
            try {
                month = scanner.nextInt();
                if (month < 1 || month > 12) {
                    throw new IllegalArgumentException("Month must be between 1 and 12.");
                }
                return month;
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Please enter a number between 1 and 12.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int validateDay(int year, int month) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        while (true) {
            System.out.print("Enter the day: ");
            try {
                day = scanner.nextInt();
                YearMonth yearMonth = YearMonth.of(year, month);
                int maxDay = yearMonth.lengthOfMonth();
                if (day < 1 || day > maxDay) {
                    throw new IllegalArgumentException("Day must be between 1 and " + maxDay + ".");
                }
                return day;
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Please enter a valid day.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
