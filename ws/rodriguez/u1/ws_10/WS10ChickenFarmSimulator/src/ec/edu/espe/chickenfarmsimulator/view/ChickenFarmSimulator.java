/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 * @author David Rodriguez,THEJAVABANDITS DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Segarra's Chicken Farm Simulator V 0.5");

        int id, validOption, selectedOption, bornYear, bornMonth, bornDay;
        String name, color, bornDate, fileName = "chickens.txt", chickeRecord;
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
        bornYear = birthDate.getYear();
        bornMonth = birthDate.getMonthValue();
        bornDay = birthDate.getDayOfMonth();
        bornDate = bornYear + "/" + bornMonth + "/" + bornDay;

        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);

        int year = period.getYears();
        int month = period.getMonths();
        int day = period.getDays();

        Chicken chicken = new Chicken(id, color, name, bornDate, molting, year, month, day);

        validOption = DateValidator.getValidOption();

        FileManager.save(chicken.toString(validOption), "chickens", validOption);
        
        System.out.println("You want to delete or update a file?:\n0.-Delete\n1.-Update\n2.-Leave");
        selectedOption = scan.nextInt();
                
        chickeRecord = FileManager.read(fileName, validOption);
        
        if(selectedOption == 0){
            FileManager.delete(chickeRecord, validOption);
        }
        if(selectedOption == 1){
            FileManager.update(chickeRecord, validOption);
        }
    }
}