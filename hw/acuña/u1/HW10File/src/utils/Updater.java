package utils;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.*;
import java.util.List;
/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
 */

public class Updater {

    public static void updateChicken(String fileName, int type, Chicken updatedChicken) {
        List<Chicken> chickens = Reader.readChickens(fileName, type);
        boolean found = false;
        
        for (int i = 0; i < chickens.size(); i++) {
            if (chickens.get(i).getId() == updatedChicken.getId()) {
                chickens.set(i, updatedChicken);
                found = true;
                break;
            }
        }
        
        if (found) {
            FileManager.FileSave("", fileName, type);  // Clear the file first
            for (Chicken chicken : chickens) {
                FileManager.FileSave(chicken.toString(type), fileName, type);
            }
        } else {
            System.out.println("Chicken with ID " + updatedChicken.getId() + " not found.");
        }
    }
}
