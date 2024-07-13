/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexoperations.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class Operation {


    public static float addTwoNumbers(float addend1, float addend2) {
        float sum = addend1 + addend2;
        // Redondear a 2 decimales
        BigDecimal bd = new BigDecimal(Float.toString(sum));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }
    
}
