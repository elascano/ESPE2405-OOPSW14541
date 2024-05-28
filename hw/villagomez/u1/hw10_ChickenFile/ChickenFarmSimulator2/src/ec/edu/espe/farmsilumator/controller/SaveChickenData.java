package ec.edu.espe.farmsilumator.controller;

import ec.edu.espe.farmsilumator.model.Chicken;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class SaveChickenData {
    public static void saveChickenData(Chicken chicken){
        try (FileWriter chickenData = new FileWriter("C:\\Users\\usuar\\OneDrive\\ESPE\\2 software\\POO\\repositorio\\ESPE2405-OOPSW14541\\hw\\villagomez\\u1\\hw10_ChickenFile\\chickenData.txt")) {
            chickenData.write("Id: " + chicken.getId() + "\nName: " + chicken.getName() +
                    "\nColor: " + chicken.getColor() + "\nAge: " + chicken.getAge() + 
                    "\nMolting: " + chicken.isMolting() + "\nBorn on date: " + chicken.getBornOnDate());
            
        } catch (IOException e) {
            System.out.println("Error while writing the file: " + e.getMessage());
        }
    }
}
