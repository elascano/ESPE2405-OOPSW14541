/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.controller;

import java.util.Date;
import java.util.Scanner;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class ChickenInput {
    public static Chicken enterData(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter ID of Chicken: ");
            int id = scanner.nextInt();
            scanner.nextLine();  

            System.out.print("Enter name for the Chicken: ");
            String name = scanner.nextLine();

            System.out.print("Enter color for the Chicken: ");
            String color = scanner.nextLine();

            System.out.print("Enter age for the Chicken: ");
            int age = scanner.nextInt();

            System.out.print("Is it molting (true/false)?: ");
            boolean molting = scanner.nextBoolean();
            scanner.nextLine();  

            LocalDate bornOnDate = null;
            boolean dateValid = false;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            while (!dateValid) {
                System.out.print("Enter born on date (dd/MM/yyyy): ");
                String dateInput = scanner.nextLine();
                try {
                    bornOnDate = LocalDate.parse(dateInput, formatter);
                    dateValid = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date format. Please enter the date in the format dd/MM/yyyy.");
                }
            }
            
            
            
            return new Chicken(id,name,color,age,molting,bornOnDate);
        
    }
}
