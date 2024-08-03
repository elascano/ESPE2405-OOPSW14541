package ec.edu.espe.complexoperations.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Luis Vaca, DCCO-ESPE
 */
public class PersonController {

    public static int computeAgeInDays(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(birthDate, today);
    }

    public static int computeAgeInYears(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(birthDate, today);
    }
}
