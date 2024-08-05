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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        //radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        //height = scanner.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);

        double volume = 3.1416 * (cylinder.getRadius() * cylinder.getRadius()) * cylinder.getHeight();

        System.out.println("The volume of the cylinder is: " + volume);
        BigDecimal bd = new BigDecimal(Double.toString(volume));
        bd = bd.setScale(2, RoundingMode.DOWN);
        double finalVolume = bd.doubleValue();
        
        return finalVolume;
    }
}
