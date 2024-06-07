package espe.edu.ec.farmsimulator.view;

import UtilsPackage.FileManager;
import espe.edu.ec.farmsimulator.model.Chicken;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public class FarmSimulator {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Saray's Chicken Farm Simulator V 0.5");
        
        
        int menuOption;
        System.out.println("What action do you want to execute? ");
        System.out.println("1. Add new chicken");
        System.out.println("2. Delete 1 chicken data");
        System.out.println("Option:  ");
        menuOption = input.nextInt();
        
        
        if (menuOption == 1){
           addNewChicken ();
        }else{
           deleteChicken ();
        }

    }

    
    private static void addNewChicken() throws IOException, ParseException {
        Scanner input = new Scanner(System.in);
        String idString;
        int id;
        String name;
        String color;
        int age;
        boolean molting;
        String bornOnDate;
        String addAnotherChicken;
        
        

        do {
            do {
                System.out.print("ID: ");
                idString = input.nextLine();
            } while (!isValidId(idString));
            id = Integer.parseInt(idString);

            System.out.print("Name: ");
            name = input.nextLine();

            System.out.print("Color: ");
            color = input.nextLine();

            System.out.print("Born on date (dd/mm/yyyy): ");
            bornOnDate = input.nextLine();
            age = calculateAge(bornOnDate);

            System.out.println("Molting (true/false): ");
            String moltingString = input.nextLine();
            molting = Boolean.parseBoolean(moltingString);

            Chicken chicken = new Chicken(id, name, color, age, molting, bornOnDate);

            FileManager.save(chicken.toString(1), "chickens",1);
            FileManager.save(chicken.toString(2), "chickens",2);

            System.out.println("Chicken ---> \n" + chicken);

            System.out.print("Do you want to add another chicken? (y/n): ");
            addAnotherChicken = input.nextLine();

        } while (addAnotherChicken.equalsIgnoreCase("y"));
    }
    
    
     private static void deleteChicken () throws IOException{
        Scanner input = new Scanner(System.in);
        String deleteLine;
        int numOfLineToDelete;
        
        System.out.print("Are your sure you want to delete a chicken? (y/n): ");
            deleteLine = input.nextLine();
            
            if (deleteLine.equalsIgnoreCase("y")){
                 System.out.print("Which chicken you want to delete?  ");
                 numOfLineToDelete = input.nextInt();
                FileManager.delete("chickens.csv", numOfLineToDelete);
                FileManager.delete("chickens.json", numOfLineToDelete);
            }else{
                System.out.println("Delete process canceled! ");
            }
    }
     
     
    private static boolean isValidId(String idString) {
        try {
            Integer.parseInt(idString);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("ID must be a number. Please try again.");
            return false;
        }
    }

    private static int calculateAge(String bornOnDate) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        long thenInMillis = format.parse(bornOnDate).getTime();
        long nowInMillis = System.currentTimeMillis();
        long diffInMillis = nowInMillis - thenInMillis;
        return (int) (diffInMillis / (1000L * 60 * 60 * 24 * 365));
    }
}
