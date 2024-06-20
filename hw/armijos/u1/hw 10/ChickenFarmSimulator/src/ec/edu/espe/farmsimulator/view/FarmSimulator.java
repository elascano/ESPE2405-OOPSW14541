
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.controller.FileManager;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Enzo Armijos,Logic Legion, DCCO-ESPE
 */
public class FarmSimulator {
    
    public static void main(String[] args) {
        System.out.println("Enzo ChickenFarm Simulator V0.5");

        ChickenView view = new ChickenView();
        FileManager controller = new FileManager();
        List<Chicken> chickens = new ArrayList<>(); 

        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            Chicken chicken = view.getChickenDetailsFromUser();
            chickens.add(chicken); 
            view.displayChickenDetails(chicken); 
            controller.Save("chicken_data.txt", chickens); 
            controller.saveToJson("chicken_data.json", chickens); 
            System.out.println("Data saved to chicken_data.txt and chicken_data.json");

            System.out.print("Do you want to add another chicken? (yes/no): ");
            answer = scanner.nextLine();
        } while (answer.equalsIgnoreCase("yes")); 

        scanner.close();
    }

}
  

