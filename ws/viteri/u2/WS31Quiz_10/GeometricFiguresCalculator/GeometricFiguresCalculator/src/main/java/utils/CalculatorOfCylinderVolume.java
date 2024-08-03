/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package utils;

import ec.edu.espe.geometricfigurescalculator.model.Cylinder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author Volumen of a Cilinder - Doménica Villagómez, Alexis Viteri
 */
public class CalculatorOfCylinderVolume {

    public static double computeVolume(double radius, double height) {
        double volume = Math.PI * Math.pow(radius, 2) * height;

        BigDecimal bd = new BigDecimal(Double.toString(volume));
        bd = bd.setScale(2, RoundingMode.DOWN);
        return bd.doubleValue();
    }
}