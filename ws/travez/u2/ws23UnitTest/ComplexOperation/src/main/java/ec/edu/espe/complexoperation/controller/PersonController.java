/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.complexoperation.controller;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author G406
 */
public class PersonController {

    public static int computeAgeInDays(LocalDate birthDate) {
        int days;
        LocalDate today = LocalDate.now();
        int numberOfDaysOfYears = Period.between(birthDate, today).getYears() * 365;
        int numberOfDaysOfMonths = (Period.between(birthDate, today).getMonths()) * 30;
        int numberOfDays = Period.between(birthDate, today).getDays() * 365;
        days = numberOfDaysOfYears + numberOfDaysOfMonths + numberOfDays;
        return days;
    }

    public static int computeAgeInYears(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        int numberOfDaysOfYears = Period.between(birthDate, today).getYears();
        return numberOfDaysOfYears;
    }
    
}
