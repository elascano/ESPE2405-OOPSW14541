/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class Operations {

    public static double addTwoNumbers(double addend1, double addend2) {
        double sum = addend1 + addend2;
        return round(sum, 2); // Redondear a 2 decimales
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
