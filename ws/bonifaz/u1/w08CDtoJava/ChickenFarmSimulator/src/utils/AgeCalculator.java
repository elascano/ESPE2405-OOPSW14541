
package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class AgeCalculator {
    public static int AgeCalculator(String bornOnDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate birthDate = LocalDate.parse(bornOnDate, formatter);
            LocalDate currentDate = LocalDate.now();
            return Period.between(birthDate, currentDate).getYears();
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha inválido: " + bornOnDate);
            return -1; 
        }
    
    
    
}}
