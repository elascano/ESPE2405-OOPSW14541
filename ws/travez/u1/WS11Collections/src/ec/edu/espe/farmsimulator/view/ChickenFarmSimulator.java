/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;

import UtilityPackages.FileManager;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 *
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Hello chickens from Imsale Travez \nChicken Farm Simulator 2K24 V 0.4   ");

        Chicken chicken = new Chicken(1, "Lucy", "Black", true, LocalDate.parse("21/10/2020", dateFormat));

        System.out.println("Chicken --> " + chicken);

        int id;
        String name;
        String color;
        boolean molting;
        LocalDate bornOnDate;

        //chicken = FileManager.readChickensFromFile("Maruja.json");
        System.out.println("Chicken --> " + chicken);

        // Workshop
        Short minuend;
        short subtrahend;
        short difference;

        minuend = (short) 70000;
        System.out.println(minuend);

        float addend1 = 1.2F;
        float addend2 = 2.4F;
        float sum;
        sum = addend1 + addend2;
        System.out.println(sum);

        char vowell = '5';
        subtrahend = (short) vowell;
        difference = (short) (minuend - subtrahend);
        System.out.println(subtrahend);

        System.out.println(difference);

        // Input data
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter chicken ID: ");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter chicken name: ");
        name = scanner.nextLine();

        System.out.print("Enter chicken color: ");
        color = scanner.nextLine();

        System.out.print("Is the chicken molting? (true/false): ");
        molting = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Enter chicken birth date (dd/MM/yyyy): ");
        String bornOnDateString = scanner.nextLine();
        bornOnDate = LocalDate.parse(bornOnDateString, dateFormat);

        chicken = new Chicken(id, name, color, molting, bornOnDate);
        System.out.println("Chicken --> " + chicken);

        FileManager.save(chicken.toString(), "chickens", "json");
    }
}
