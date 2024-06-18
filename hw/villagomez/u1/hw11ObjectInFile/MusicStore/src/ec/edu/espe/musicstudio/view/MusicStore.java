package ec.edu.espe.musicstudio.view;

import ec.edu.espe.musicstudio.model.MusicalInstrument;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class MusicStore {
    public static void main(String[] args) {
        MusicalInstrument musicalInstrument;
        
        musicalInstrument = new MusicalInstrument(1, "Guitar", "Acoustic", "Medium");
        
        ObjectLib.ObjectManager.saveObject(musicalInstrument);
        
        System.out.println("Musical Instrument ---> "+musicalInstrument);
    }
}
