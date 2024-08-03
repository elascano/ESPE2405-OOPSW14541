/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.speedcalculator.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;


/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class SpeedCalculator {
    
    public static double calculateSpeed(double distance, double time) {
        if (time <= 0 || distance < 0) {
            return 0;
        }
        double speed = distance / time;
        return roundToThreeDecimals(speed);
    }
    
    private static double roundToThreeDecimals(double value) {
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(3, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
