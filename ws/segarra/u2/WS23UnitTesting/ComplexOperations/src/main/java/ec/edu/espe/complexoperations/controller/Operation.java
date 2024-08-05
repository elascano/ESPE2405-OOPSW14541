/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.complexoperations.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class Operation {

    public static float addTwoNumbers(float addend1, float addend2) {
        BigDecimal sum = BigDecimal.valueOf(addend1).add(BigDecimal.valueOf(addend2));
        sum = sum.setScale(2, RoundingMode.HALF_UP);
        return sum.floatValue();
    }

}
