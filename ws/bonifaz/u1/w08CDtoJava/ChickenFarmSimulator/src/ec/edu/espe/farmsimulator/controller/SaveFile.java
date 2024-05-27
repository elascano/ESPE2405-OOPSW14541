package ec.edu.espe.farmsimulator.controller;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */

public class SaveFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\mateo\\Downloads\\ChickensData.txt"))) {
            writer.write("");
            System.out.println("Christian's Chicken farm simulator V0.6"); 
            System.out.println("\nChicken Data");
   
            System.out.print("ID: ");
            int id = scanner.nextInt();
                    
            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Color: ");
            String color = scanner.next();

            System.out.print("Age : ");
            int age = scanner.nextInt();

            System.out.print("Molting [true/false]: ");
            boolean molting = scanner.nextBoolean();

            Date bornOnDate=new Date();
            Chicken chicken = new Chicken(id, name, color, age, molting, bornOnDate);
            System.out.println("\n--- Saved Data ---");
            System.out.println(chicken);
            writer.write(chicken.toString());
            writer.newLine();
            }  
            catch (IOException e) {
            } 
    }
}
