/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.input;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS,DCCO-ESPE
 */
public class ChickenInput {
     public static Chicken enterChickenData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter chicken data:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Clear input buffer

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Color: ");
        String color = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Is molting? (true/false): ");
        boolean molting = scanner.nextBoolean();

        return new Chicken(id, name, color, age, molting, new Date());
    }
}
