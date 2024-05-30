package utils;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.List;


/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
 */

public class Searcher {

    public static Chicken findChickenById(String fileName, int type, int id) {
        List<Chicken> chickens = Reader.readChickens(fileName, type);
        
        for (Chicken chicken : chickens) {
            if (chicken.getId() == id) {
                return chicken;
            }
        }
        
        System.out.println("Chicken with ID " + id + " not found.");
        return null;
    }
}
