/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.event.computeaceleration.view;

import java.util.Scanner;
import ec.edu.espe.event.computeaceleration.controller.ComputeAcelearation;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class Q06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float force, mass, aceleration;
        
        System.out.println("Welcome, this program only compute a positive aceleration");
        System.out.println("Type the amount of force put in the object: ");
        force = scanner.nextFloat();
        System.out.println("Type the amount of mass that the object have: ");
        mass = scanner.nextFloat();
        
        aceleration = ComputeAcelearation.computeAceleration(force, mass);
        
        System.out.println("The aceleration of the object is: " + aceleration + "m/s^2");
        
    }
}
