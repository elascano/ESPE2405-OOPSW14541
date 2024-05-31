//package ec.edu.espe.farmsimulator.view;
//
//import ec.edu.espe.farmsimulator.model.Chicken;
//import java.util.Date;
//import java.util.Scanner;
//import utils.AgeCalculator;
//import utils.DateConverter;
//import utils.FileManager;
//
///**
// *
// * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
// */
//public class FarmSimulator {
//
//    public static void main(String[] args) {
//        int age = 0, type = 0;
//        String bornOnDate = "";
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Marcelo's Chicken Farm Simulator V0.7");
//        System.out.print("\nEnter the file name: ");
//        String fileName = scanner.next();
//        System.out.println(" ");
//        System.out.println("\nChoose the type is your file: ");
//        System.out.println("0. Text file (.txt)");
//        System.out.println("1. Comma Separated Values (.csv)");
//        System.out.println("2. JavaScript Object Notation (.json)");
//        
//        do {
//            System.out.print("\nEnter your selection: ");
//            type = scanner.nextInt();
//        } while (type < 0 || type > 2);
//
//        System.out.print("\nHow many chickens do you want to enter?: ");
//        int chickenNumber = scanner.nextInt();
//
//        for (int aux = 0; aux < chickenNumber; aux++) {
//
//            System.out.println("\nChicken Data");
//
//            int id = FileManager.FileReadLastId(fileName, type) + 1;
//
//            System.out.print("ID: " + id + "\n");
//
//            System.out.print("Name: ");
//            String name = scanner.next();
//
//            System.out.print("Color: ");
//            String color = scanner.next();
//
//            System.out.print("Molting [true/false]: ");
//            boolean molting = scanner.nextBoolean();
//
//            do {
//                System.out.print("Born on date [dd/MM/yyyy]: ");
//                bornOnDate = scanner.next();
//                age = AgeCalculator.calculateAge(bornOnDate);
//                if (age == -1) {
//                    System.out.println("Invalid date format. Please use dd/MM/yyyy.");
//                } else {
//                    System.out.println("Age: " + age);
//                }
//            } while (age == -1);
//
//            Date bornDateFormat = DateConverter.convertToDate(bornOnDate);
//            Chicken chicken = new Chicken(id, name, color, age, molting, bornDateFormat);
//
//            FileManager.FileSave(chicken.toString(type), fileName, type);
//        }
//        
//        scanner.close();
//    }
//}

package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import utils.AgeCalculator;
import utils.DateConverter;
import utils.FileManager;
import utils.Eraser;
import utils.Reader;
import utils.Searcher;
import utils.Updater;

/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
 */
public class FarmSimulator {

    public static void main(String[] args) {
        int type = 0;
        String fileName = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Marcelo's Chicken Farm Simulator V0.7");
        System.out.print("\nEnter the file name: ");
        fileName = scanner.next();
        System.out.println(" ");
        System.out.println("\nChoose the type of your file: ");
        System.out.println("0. Text file (.txt)");
        System.out.println("1. Comma Separated Values (.csv)");
        System.out.println("2. JavaScript Object Notation (.json)");
        
        do {
            System.out.print("\nEnter your selection: ");
            type = scanner.nextInt();
        } while (type < 0 || type > 2);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add Chickens");
            System.out.println("2. Read Chickens");
            System.out.println("3. Update Chicken");
            System.out.println("4. Delete Chicken");
            System.out.println("5. Find Chicken by ID");
            System.out.println("6. Exit");

            System.out.print("\nEnter your selection: ");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    addChickens(scanner, fileName, type);
                    break;
                case 2:
                    readChickens(fileName, type);
                    break;
                case 3:
                    updateChicken(scanner, fileName, type);
                    break;
                case 4:
                    deleteChicken(scanner, fileName, type);
                    break;
                case 5:
                    findChicken(scanner, fileName, type);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }
        scanner.close();
    }

    private static void addChickens(Scanner scanner, String fileName, int type) {
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

            String bornOnDate;
            int age;
            do {
                System.out.print("Born on date [dd/MM/yyyy]: ");
                bornOnDate = scanner.next();
                age = AgeCalculator.calculateAge(bornOnDate);
                if (age == -1) {
                    System.out.println("Invalid date format. Please use dd/MM/yyyy.");
                } else {
                    System.out.println("Age: " + age);
                }
            } while (age == -1);

            Date bornDateFormat = DateConverter.convertToDate(bornOnDate);
            Chicken chicken = new Chicken(id, name, color, age, molting, bornDateFormat);

            FileManager.FileSave(chicken.toString(type), fileName, type);
        }
    }

    private static void readChickens(String fileName, int type) {
        List<Chicken> chickens = Reader.readChickens(fileName, type);
        System.out.println("\nChicken List:");
        for (Chicken chicken : chickens) {
            System.out.println(chicken);
        }
    }

    private static void updateChicken(Scanner scanner, String fileName, int type) {
        System.out.print("\nEnter the ID of the chicken to update: ");
        int id = scanner.nextInt();
        Chicken existingChicken = Searcher.findChickenById(fileName, type, id);

        if (existingChicken != null) {
            System.out.println("\nUpdating Chicken Data");
            System.out.print("Name [" + existingChicken.getName() + "]: ");
            String name = scanner.next();
            System.out.print("Color [" + existingChicken.getColor() + "]: ");
            String color = scanner.next();
            System.out.print("Molting [true/false] [" + existingChicken.isMolting() + "]: ");
            boolean molting = scanner.nextBoolean();

            String bornOnDate;
            int age;
            do {
                System.out.print("Born on date [dd/MM/yyyy] [" + DateConverter.convertToDate(existingChicken.getBornOnDate().toString()) + "]: ");
                bornOnDate = scanner.next();
                age = AgeCalculator.calculateAge(bornOnDate);
                if (age == -1) {
                    System.out.println("Invalid date format. Please use dd/MM/yyyy.");
                } else {
                    System.out.println("Age: " + age);
                }
            } while (age == -1);

            Date bornDateFormat = DateConverter.convertToDate(bornOnDate);
            Chicken updatedChicken = new Chicken(id, name, color, age, molting, bornDateFormat);

            Updater.updateChicken(fileName, type, updatedChicken);
        } else {
            System.out.println("Chicken with ID " + id + " not found.");
        }
    }

    private static void deleteChicken(Scanner scanner, String fileName, int type) {
        System.out.print("\nEnter the ID of the chicken to delete: ");
        int id = scanner.nextInt();
        Eraser.deleteChicken(fileName, type, id);
    }

    private static void findChicken(Scanner scanner, String fileName, int type) {
        System.out.print("\nEnter the ID of the chicken to find: ");
        int id = scanner.nextInt();
        Chicken chicken = Searcher.findChickenById(fileName, type, id);
        if (chicken != null) {
            System.out.println("Chicken found: " + chicken);
        } else {
            System.out.println("Chicken with ID " + id + " not found.");
        }
    }
}
