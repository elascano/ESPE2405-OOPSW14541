/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Marco Chanataxi, Dev Dynasty, DCCO-ESPE
 */
public class ChickenView {

    public ChickenView() {
    }

    public Chicken getChickenDetailsFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter chicken id: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter chicken name: ");
        String name = scanner.nextLine();

        System.out.print("Enter chicken color: ");
        String color = scanner.nextLine();

        System.out.print("Is the chicken molting? (true/false): ");
        boolean molting = scanner.nextBoolean();

        scanner.nextLine();

        System.out.print("Enter chicken birth date (YYYY-MM-DD): ");
        String bornOnDateString = scanner.nextLine();

        Date bornOnDate = null;
        try {
            bornOnDate = new SimpleDateFormat("yyyy-MM-dd").parse(bornOnDateString);
        } catch (ParseException e) {
            System.err.println("Invalid date format. Please use YYYY-MM-DD.");
            System.exit(1);
        }
        long currentTime = System.currentTimeMillis();
        long ageInMillis = currentTime - bornOnDate.getTime();
        int ageInYears = (int) (ageInMillis / (1000 * 60 * 60 * 24 * 365));

        return new Chicken(id, name, color, molting, bornOnDate, ageInYears);
    }

    public void displayChickenDetails(Chicken chicken) {
        System.out.println("Chicken Details: " + chicken);
    }
}


    
  




