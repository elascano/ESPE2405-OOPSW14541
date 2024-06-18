package ec.edu.espe.chickenfarmsimulator.view;

import ec.edu.espe.chickenfarmsimulator.model.Chicken;
import utils.FileManager;
import utils.DateValidator;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Perez's Chicken Farm Simulator V 0.5");
        
        int id;
        String name, color;
        boolean molting;
        
        System.out.println("Enter the ID for the chicken:");
        id = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter the name of the chicken: ");
        name = scan.nextLine();
        
        System.out.println("Enter the color of the chicken: ");
        color = scan.nextLine();
        
        System.out.println("Is the chicken molting? (true or false): ");
        molting = scan.nextBoolean();
        
        LocalDate birthDate = DateValidator.getChickenBirthDate();
        
        LocalDate currentDate = LocalDate.now();
        
        Period period = Period.between(birthDate, currentDate);
        
        int year = period.getYears();
        int month = period.getMonths();
        int day = period.getDays();
        
        Chicken chicken = new Chicken(id, name, color, molting, year, month, day);
        
        // Assuming the user wants to save data as CSV
        FileManager.save(chicken.toString(1), "chickens", 1);
    }
}
