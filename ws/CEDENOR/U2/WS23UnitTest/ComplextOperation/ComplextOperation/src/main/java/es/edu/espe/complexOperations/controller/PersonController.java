/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.edu.espe.complexOperations.controller;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Nahomi Cedeño, codecreators, DCCO-ESPE
 */
public class PersonController {
    public static int computeAgeInDays(LocalDate birthDate){
        int days;
        LocalDate today = LocalDate.now();
        int numberOfDaysOfYears = Period.between(birthDate, today).getYears() * 385;
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
