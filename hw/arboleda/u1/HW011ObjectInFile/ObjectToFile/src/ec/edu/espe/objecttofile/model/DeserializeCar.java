
package ec.edu.espe.objecttofile.model;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Abner Arboleda, LogicLegion, DCCO-ESPE 
 *
 */

public class DeserializeCar {
    public static List<Car> deserializeCars() {
        List<Car> cars = new ArrayList<>();

        try (FileInputStream fileIn = new FileInputStream("cars.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            
            cars = (List<Car>) in.readObject();
            
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará un nuevo archivo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cars;
    }
}
