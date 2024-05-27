package ec.edu.espe.farmsimulator.controller;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class FileManager {
    
    public static void saveToFile(Chicken chicken, String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(chicken.toString() + "\n");
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving to file.");
            e.printStackTrace();
        }
    }
}
