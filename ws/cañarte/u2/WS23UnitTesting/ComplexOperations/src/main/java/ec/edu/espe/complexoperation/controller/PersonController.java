package ec.edu.espe.complexoperation.controller;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 
 * 
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public class PersonController {

    public static int computeAgeInDays(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        long days = ChronoUnit.DAYS.between(birthDate, today);
        return (int) days;
    }
  
    public static int computeAgeInYears (LocalDate birthDate){
        LocalDate today = LocalDate.now();
        int numberOfDaysOfYears = Period.between(birthDate, today).getYears();
        return numberOfDaysOfYears;
    }
}
