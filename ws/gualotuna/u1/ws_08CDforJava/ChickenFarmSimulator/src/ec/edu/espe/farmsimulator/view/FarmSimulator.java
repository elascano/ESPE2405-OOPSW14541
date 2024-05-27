/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("Chicken.txt"))){
            writer.println("Brayan's Chicken Farm Simulator V 0.5");
                                  
            Chicken chicken = new Chicken(1, "Lucy","white and brown" , 0, true, new Date());
            writer.println("Chicken --> \n" + chicken);
            
            System.out.print("Enter ID of the second Chicken: ");
            int id = scanner.nextInt();
            scanner.nextLine();  

            System.out.print("Enter name for the second Chicken: ");
            String name = scanner.nextLine();

            System.out.print("Enter color for the second Chicken: ");
            String color = scanner.nextLine();

            System.out.print("Enter age for the second Chicken: ");
            int age = scanner.nextInt();

            System.out.print("Is it molting (true/false)?: ");
            boolean molting = scanner.nextBoolean();
            scanner.nextLine();  

            Date bornOnDate = new Date();
            /*int id = 2;
            String name = "Maruja";
            String color = "black";
            int age = 1;
            boolean molting = false;
            Date bornOnDate = new Date();*/
        
            chicken = new Chicken(id, name, color, age, molting, bornOnDate);
            writer.println("Chicken 2 --> \n" + chicken);
        }catch (IOException e){
    e.printStackTrace();
}
        
        
    }
    
}
