package Utils;

import ec.edu.espe.objectinfile.model.AutoMobile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class ObjectsToFile {

    public void writeObjectInFile(String fileName, ArrayList<AutoMobile> objectOfAutoMobile) {

        try {

            FileOutputStream file = new FileOutputStream(fileName + ".bin");
            ObjectOutputStream object = new ObjectOutputStream(file);

            object.writeObject(objectOfAutoMobile);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<AutoMobile> readObjectInFile(String fileName, ArrayList<AutoMobile> autoMobiles) {

        try {

            FileInputStream fileReader = new FileInputStream(fileName + ".bin");
            ObjectInputStream object = new ObjectInputStream(fileReader);

            autoMobiles = (ArrayList<AutoMobile>) object.readObject();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectsToFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ObjectsToFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        return autoMobiles;

    }

}
