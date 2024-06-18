package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import utils.AgeCalculator;
import utils.DateConverter;
import utils.FileManager;

/**
 *
* @author Nahomi Cedeño, CODE CREATORS, DCCO-ESPE
 */
public class FarmSimulator {

    public static void main(String[] args) {
        int age = 0, type = 0;
        String bornOnDate = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nahomi's Chicken farm simulator V0.6");
        System.out.print("\nEnter file name to save data: ");
        String fileName = scanner.next();

        System.out.println("\nHow do you want to save the file?: ");
        System.out.println("0. Text file (.txt)");
        System.out.println("1. Comma Separated Values (.csv)");
        System.out.println("2. JavaScript Object Notation (.json)");

        do {
            System.out.print("\nEnter your selection: ");
            type = scanner.nextInt();
        } while (type < 0 || type > 2);

        System.out.print("\nHow many chickens do you want to enter?: ");
        int chickenNumber = scanner.nextInt();

        for (int aux = 0; aux < chickenNumber; aux++) {

            System.out.println("\nChicken Data");

            int id = FileManager.FileReadLastId(fileName, type) + 1;

            System.out.print("ID: " + id + "\n");

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Color: ");
            String color = scanner.next();

            System.out.print("Molting [true/false]: ");
            boolean molting = scanner.nextBoolean();

            do {
                System.out.print("Born on date [dd/MM/yyyy]: ");
                bornOnDate = scanner.next();
                age = AgeCalculator.AgeCalculator(bornOnDate);
            } while (age == -1);

            Date bornDateFormat = DateConverter.convertToDate(bornOnDate);
            Chicken chicken = new Chicken(id, name, color, age, molting, bornDateFormat);

            FileManager.FileSave(chicken.toString(type), fileName, type);   
        }
        

    }
}
