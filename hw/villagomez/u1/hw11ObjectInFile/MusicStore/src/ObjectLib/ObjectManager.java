package ObjectLib;

import ec.edu.espe.musicstudio.model.MusicalInstrument;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class ObjectManager {
    public static void saveObject(MusicalInstrument musicalInstrument) {
        try (FileOutputStream fileOut = new FileOutputStream("musicalInstrument.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(musicalInstrument);
            System.out.println("Serialized data is saved in musicalInstrument.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
