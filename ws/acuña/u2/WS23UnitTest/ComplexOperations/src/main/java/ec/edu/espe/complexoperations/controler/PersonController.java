package ec.edu.espe.complexoperations.controler;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE 
 *
 */
public class PersonController {
    
        public static int computeAgeInDays(LocalDate birthDate) {
        int days;
        LocalDate today = LocalDate.now();
        int numberOfDaysOfYears = Period.between(birthDate, today).getYears() * 365;
        int numberOfDaysOfMonths = (Period.between(birthDate, today).getMonths()) * 30;
        int numberOfDays = Period.between(birthDate, today).getDays();
        days = numberOfDaysOfYears + numberOfDaysOfMonths + numberOfDays;
        return days;
    }
    public static int computeAgeInYears(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        int numberOfDaysOfYears = Period.between(birthDate, today).getYears();
        return numberOfDaysOfYears;
}

}
