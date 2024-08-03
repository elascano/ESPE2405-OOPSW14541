package ec.edu.espe.complexoperations.controler;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Nahomi Cedeño, codecreators, DCCO-ESPE

 *
 */
public class PersonController {
    
    public static long computeAgeInDays(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        // Calcular la diferencia exacta en días entre las dos fechas
        long days = ChronoUnit.DAYS.between(birthDate, today);
        return days;
    }
    public static int computeAgeInYears(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        int numberOfDaysOfYears = Period.between(birthDate, today).getYears();
        return numberOfDaysOfYears;
}

}
