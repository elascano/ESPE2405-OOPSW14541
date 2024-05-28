package utils;

import ec.edu.espe.farmsilumator.model.Chicken;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class FileManager {
    public static void saveChickenData(Chicken chicken){
        try (FileWriter chickenData = new FileWriter("C:\\Users\\usuar\\OneDrive\\ESPE\\2 software\\POO\\repositorio\\ESPE2405-OOPSW14541\\hw\\villagomez\\u1\\hw10_ChickenFile\\chickenData.txt")) {
            chickenData.write( chicken.getId() + ", " + chicken.getName() +
                ", " + chicken.getColor() + ", " + chicken.getAge() + 
                ", " + chicken.isMolting() + ", " + chicken.getBornOnDate());
            
        } catch (IOException e) {
            System.out.println("Error while writing the file: " + e.getMessage());
        }
    }
    
    
}

