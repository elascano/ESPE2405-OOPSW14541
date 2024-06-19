package ObjectLib;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public class ObjectManager {
    public static void saveObject(Object obj, String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename, true); 
            ObjectOutputStream objectOut;
            
            if (new File(filename).length() == 0) {
                objectOut = new ObjectOutputStream(fileOut); 
            } else {
                objectOut = new AppendingObjectOutputStream(fileOut); 
            }
            
            objectOut.writeObject(obj);
            objectOut.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Object> loadObject(String filename) {
   List<Object> objects = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            while (true) {
                try {
                    Object obj = objectIn.readObject();
                    objects.add(obj);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objects;
    }
    
}


class AppendingObjectOutputStream extends ObjectOutputStream {
    public AppendingObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        
        reset();
    }
}
