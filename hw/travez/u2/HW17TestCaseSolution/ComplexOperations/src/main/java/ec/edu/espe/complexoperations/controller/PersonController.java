package ec.edu.espe.complexoperations.controller;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class PersonController {
   public static long computeAgeInDays(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        long days = ChronoUnit.DAYS.between(birthDate, today);
        return days;

    }
    public static int computeAgeInYears(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        int numberOfDaysOfYears = Period.between(birthDate, today).getYears();
        return numberOfDaysOfYears;

    }

 

}
