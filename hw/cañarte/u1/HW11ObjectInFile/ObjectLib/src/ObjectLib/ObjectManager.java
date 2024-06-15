package ObjectLib;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectManager {
    public static void saveObject(Object obj, String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename, true); // Modo append
            ObjectOutputStream objectOut;
            
            if (new File(filename).length() == 0) {
                objectOut = new ObjectOutputStream(fileOut); // Usa ObjectOutputStream normal si el archivo está vacío
            } else {
                objectOut = new AppendingObjectOutputStream(fileOut); // Usa AppendingObjectOutputStream si el archivo no está vacío
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
