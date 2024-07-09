/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexoperations.controller;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
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
