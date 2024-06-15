package ec.edu.espe.objectinfile.view;

import Object.ObjectManager;
import ec.edu.espe.objectinfile.model.Plane;
import java.io.IOException;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class ObjectInFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Plane plane = new Plane(56525, "Boing", "777-8 Freighter", "commercial", "LATAM Airlines");
        ObjectManager.saveObject(plane, "777-8 Freighter.plane");
        Plane loadPlane = (Plane) ObjectManager.loadObject("777-8 Freighter.plane");
        System.out.println("Load " + loadPlane);       
    }
}
