package utils;

import ec.edu.espe.militarydininghall.model.Commensal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author TheJavaBandits, DCCO-ESPE
 */
public class Validation {
    
    public static boolean ValidCommensal(Commensal commensal) {
    return commensal != null && commensal.getId() != null && !commensal.getId().isEmpty();
}
    public static boolean ValidBalance(double balance) {
    return balance >= 0;
}
    public static boolean validateId(String idInput) {
        long id = 0;
        if (idInput.length() == 10) {
            id = Long.parseLong(idInput);
        } else {
            return false;
        }
        long[] digits = new long[10];
        long remainder;
        long doubledDigit;
        long evenPositionSum = 0;
        long oddPositionSum = 0;
        long totalSum;
        long checkDigit;

        for (int i = 9; i >= 0; i--) {
            digits[i] = (int) (id % 10);
            id /= 10;
        }

        for (int i = 0; i < 9; i += 2) {
            doubledDigit = digits[i] * 2;
            if (doubledDigit > 9) {
                doubledDigit -= 9;
            }
            evenPositionSum += doubledDigit;
        }

        for (int i = 1; i < 9; i += 2) {
            oddPositionSum += digits[i];
        }

        totalSum = evenPositionSum + oddPositionSum;
        remainder = totalSum % 10;
        checkDigit = 10 - remainder;
        if (checkDigit == 10) {
            checkDigit = 0;
        }

        return checkDigit == digits[9];
    }
    
        public static boolean isValidEmailFormat(String email) {
        String regex = "^[\\w-\\.]+@(hotmail\\.com|gmail\\.com|outlook\\.com|yahoo\\.com)$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
     
    public static boolean validBoolean() {
        Scanner scanner = new Scanner(System.in);
        boolean userInput;

        while (true) {
            try {
                userInput = scanner.nextBoolean();
                if (userInput == true || userInput == false) {
                    return userInput;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Please type true or false.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
