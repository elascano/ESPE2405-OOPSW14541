/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.complexoperation.controller;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS DCCO-ESPE
 */
public class PersonController {
    
    public static int computeAgeInDays(LocalDate birthDate){
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);
        int days = period.getYears() * 365 + period.getMonths() * 30 + period.getDays();
        return days;
    }
    
    public static int computeAgeInYears(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        int numberOfYears = Period.between(birthDate, today).getYears();
        return numberOfYears;
    }
}