
package object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class objectManager {

        public static <T extends Serializable> void saveObject(T object, String file) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file, true))) {
            out.writeObject(object);
        } catch (IOException e) {
            System.out.println("Not is a object");
        }
    }
        
       public static <T extends Serializable> T loadObject(String file) {
        T object = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            object = (T) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("The object was not found");
        }
        return object;
    }
}
