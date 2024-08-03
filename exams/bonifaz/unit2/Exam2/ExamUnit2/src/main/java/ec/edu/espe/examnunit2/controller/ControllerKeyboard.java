package ec.edu.espe.examnunit2.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @autor Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class ControllerKeyboard {
    public ControllerKeyboard() {
       
    }

     public static long getDaysBetweenDates(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }
}