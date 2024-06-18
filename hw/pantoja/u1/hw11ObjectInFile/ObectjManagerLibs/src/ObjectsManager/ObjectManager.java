/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectsManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David Pantoja, Java Squad, DCCO-ESPE
 */
public class ObjectManager {

    public static void saveObject(Object object, String fileName) throws IOException {
        FileOutputStream file = null;
        try {
            file = new FileOutputStream(fileName);
            ObjectOutputStream obj = new ObjectOutputStream(file);
            obj.writeObject(object);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Object loadObject(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream file = null;
        Object object = null;
        try {
            file = new FileInputStream(fileName);
            ObjectInputStream obj = new ObjectInputStream(file);
            object = obj.readObject();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return object;

    }
}
