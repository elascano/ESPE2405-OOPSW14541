
package ec.edu.espe.objecttofile.model;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Abner Arboleda, LogicLegion, DCCO-ESPE 
 *
 */

public class SerializeCar {
    public static void serializeCars(List<Car> cars) {
        try (FileOutputStream fileOut = new FileOutputStream("cars.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            
            out.writeObject(cars);
            
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
