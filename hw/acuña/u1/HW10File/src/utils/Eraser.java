package utils;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.*;
import java.util.List;


/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
 */

public class Eraser {

    public static void deleteChicken(String fileName, int type, int id) {
        List<Chicken> chickens = Reader.readChickens(fileName, type);
        chickens.removeIf(chicken -> chicken.getId() == id);
        
        FileManager.FileSave("", fileName, type);  // Clear the file first
        for (Chicken chicken : chickens) {
            FileManager.FileSave(chicken.toString(type), fileName, type);
        }
    }
}
