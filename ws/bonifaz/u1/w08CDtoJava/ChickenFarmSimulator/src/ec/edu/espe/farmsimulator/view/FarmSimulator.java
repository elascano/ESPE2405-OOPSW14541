package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;
import utils.AgeCalculator;
import utils.DateConverter;
import utils.FileManager;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class FarmSimulator {

    public static void main(String[] args) throws FileNotFoundException {
        int age = 0, optionManager = 0, type = 0, idEdit = 0;
        String bornOnDate = "", fileName = "", wordSearch,newData;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Christian's Chicken farm simulator V0.8");

        while (optionManager != 5) {

            optionManager = FarmSimulator.MenuForDo();

            if (optionManager != 5) {

                System.out.print("\nEnter the file name: ");
                fileName = scanner.next();

                type = FarmSimulator.MenuForTypeFile();
            }
            if (optionManager == 1) {
                FileManager.FileRead(fileName, type);
            }

            if (optionManager == 2) {
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

            if (optionManager == 3) {
                System.out.print("Enter the chicken data you want to replace: ");
                wordSearch = scanner.next();
                System.out.print("Enter the new data: ");
                newData = scanner.next();
                FileManager.UpdateData(fileName, type, wordSearch, newData);
            }

            if (optionManager == 4) {
                System.out.print("Enter the id of the chicken you want to delete: ");
                idEdit = scanner.nextInt();
                FileManager.DeleteData(fileName, type, idEdit);
            }
        }
    }

    public static int MenuForDo() {
        Scanner scanner = new Scanner(System.in);
        int optionManager;
        System.out.println("\nWhat do you want to do? ");
        System.out.println("1. Read data from a file");
        System.out.println("2. Write data to a file");
        System.out.println("3. Edit data in a file");
        System.out.println("4. Delete data to a file");
        System.out.println("5. Exit");
        do {
            System.out.print("\nEnter your selection: ");
            optionManager = scanner.nextInt();
        } while (optionManager < 1 || optionManager > 5);
        return optionManager;
    }

    public static int MenuForTypeFile() {
        Scanner scanner = new Scanner(System.in);
        int type;
        System.out.println("\nWhat is the file format?: ");
        System.out.println("0. Text file (.txt)");
        System.out.println("1. Comma Separated Values (.csv)");
        System.out.println("2. JavaScript Object Notation (.json)");
        do {
            System.out.print("\nEnter your selection: ");
            type = scanner.nextInt();
        } while (type < 0 || type > 2);
        return type;
    }

}
