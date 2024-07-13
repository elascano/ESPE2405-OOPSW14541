package ec.edu.espe.complexoperation.controller;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO - ESPE
 */
public class PersonController {
    public static int computeAgeInDays (LocalDate birthDate){
        int days;
        LocalDate today = LocalDate.now();
        int numberOfDaysOfYears = Period.between(birthDate, today).getYears()*360;
        int numberOfDaysOfMonths = Period.between(birthDate, today).getMonths()*30;
        int numberOfDays= Period.between(birthDate, today).getDays();
        days= numberOfDaysOfYears + numberOfDaysOfMonths+ numberOfDays;
        return days;
    }
    
    public static int computeAgeInYears (LocalDate birthDate){
        LocalDate today = LocalDate.now();
        int numberOfDaysOfYears = Period.between(birthDate, today).getYears();
        return numberOfDaysOfYears;
    }
}
