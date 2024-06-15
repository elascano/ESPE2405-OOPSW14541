/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ChickenFarmSimulator.view;

/**
 *
 * @author MSI-PULSE
 */
import ec.edu.espe.ChickenFarmSimulator.model.Chicken;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import utils.DateValidator;
import utils.FileManager;

public class FarmSimulator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chicken Farm Simulator V1.0");

        System.out.println("Enter the ID for the chicken:");
        int id = scan.nextInt();
        scan.nextLine(); // Consume newline

        System.out.println("Enter the name of the chicken: ");
        String name = scan.nextLine();

        System.out.println("Enter the color of the chicken: ");
        String color = scan.nextLine();

        LocalDate birthDate = DateValidator.getValidDate();
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();

        Chicken chicken = new Chicken(id, color, name, age, birthDate);
        System.out.println("Chicken details: " + chicken);

        FileManager.save(chicken, "chickens.txt");
        System.out.println("Chicken details saved to chickens.txt");
    }
}
