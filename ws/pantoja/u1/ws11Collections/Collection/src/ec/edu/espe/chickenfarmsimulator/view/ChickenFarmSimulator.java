
package ec.edu.espe.chickenfarmsimulator.view;

import ec.edu.espe.chickenfarmsimulator.model.Chicken;
import java.util.Scanner;
import utils.FileManager;
import utils.DateValidator;
import java.time.LocalDate;
import java.time.Period;

/**
 * Chicken Farm Simulator View
 * 
 * Author: David Pantoja, Java Squad, DCCO-ESPE
 
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pantoja's Chicken Farm Simulator V 0.5");
        
        int id, validOption;
        String name, color;
        boolean molting;
        
        System.out.println("Enter the ID for the chicken:");
        id = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter the name of the chicken: ");
        name = scan.nextLine();
        
        System.out.println("Enter the color of the chicken: ");
        color = scan.nextLine();
        
        System.out.println("The chicken is molting? (true or false): ");
        molting = scan.nextBoolean();
        
        LocalDate birthDate = DateValidator.getValidDate(); 
        
        LocalDate currentDate = LocalDate.now();
        
        Period period = Period.between(birthDate, currentDate);
        
        int year = period.getYears();
        int month = period.getMonths();
        int day = period.getDays();
        
        Chicken chicken = new Chicken(id, name, color, molting, year, month, day);
        
        validOption = DateValidator.getValidOption();
           
        FileManager.save(chicken.toString(1), "chikens", "json");
        
    }
    
}
*/