
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.controller.FileManager;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;


/**
 *
 * @author Enzo Armijos , Logic Legion, DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[] args) {
       System.out.println("Enzo ChikenFarm Simulator V0.5");
        Chicken chicken = new Chicken(1, "Lucy", "Brown", 0, true, new Date());
        System.out.println("Chicken---->\n" + chicken);

        int id = 2;
        String name = "Maruja";
        String color = "black";
        int age = 1;
        boolean molting = false;
        Date bornOnDate = new Date();

        chicken = new Chicken(id, name, color, age, true, bornOnDate);
        System.out.println("Chicken---->\n" + chicken);

        // Set the desired file path (replace with your actual path)
        String filePath = "C:\\Users\\user\\Documents\\NetBeansProjects\\ChickenFarmSimulator_2\\Archivo";
        FileManager fileManager = new FileManager(filePath);

        // Create a couple of Chicken objects
        Date bornOnDate1 = new Date();
        Chicken chicken1 = new Chicken(1, "Clucky", "White", 2, false, bornOnDate1);
        Date bornOnDate2 = new Date();
        Chicken chicken2 = new Chicken(2, "Feathers", "Brown", 1, true, bornOnDate2);
        Date bornOnDate3 = new Date();
        Chicken chicken3 = new Chicken(3, "Remy", "Black", 3, true, bornOnDate3);

        // Save chickens to the JSON file
        fileManager.saveChickenToJSONFile(chicken1, "Chickens.json");
        fileManager.saveChickenToJSONFile(chicken2, "Chickens.json");
        fileManager.saveChickenToJSONFile(chicken3, "Chickens.json");
    }
}
