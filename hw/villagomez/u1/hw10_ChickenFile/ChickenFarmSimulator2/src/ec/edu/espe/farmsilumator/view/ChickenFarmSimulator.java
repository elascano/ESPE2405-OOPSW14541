package ec.edu.espe.farmsilumator.view;

import ec.edu.espe.farmsilumator.controller.SaveChickenData;
import ec.edu.espe.farmsilumator.model.Chicken;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Domenica's Chicken Farm Simulator V. 0.5");
        
        try(Scanner input = new Scanner(System.in)) {
            
            int id;
            String name;
            String color;
            int age;
            boolean molting;
            Date bornOnDate;

            System.out.println("Enter the ID:");
            String idStr = input.nextLine();
            id = Integer.parseInt(idStr);

            System.out.println("Enter the name:");
            name = input.nextLine();

            System.out.println("Enter the color:");
            color = input.nextLine();

            System.out.println("Enter the age:");
            String ageStr = input.nextLine();
            age = Integer.parseInt(ageStr);

            System.out.println("Enter if its molting:");
            String moltingStr = input.nextLine();
            molting = Boolean.parseBoolean(moltingStr);

            bornOnDate = new Date();

            Chicken chicken = new Chicken(id, name, color, age, molting, bornOnDate);

            SaveChickenData.saveChickenData(chicken);

            System.out.println("Chicken --> \n");
            
        }
            
    }
        

    public ChickenFarmSimulator() {
    }
}
