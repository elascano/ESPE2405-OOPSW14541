package ec.edu.espe.objectinfile.view;

import Utils.ObjectsToFile;
import ec.edu.espe.objectinfile.model.AutoMobile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class ObjectInFile {

    public static void main(String[] args) {

        ArrayList<AutoMobile> autoMobiles = new ArrayList();
        ArrayList<AutoMobile> autoMobiles2 = new ArrayList();

        AutoMobile motorCycle = new AutoMobile(15, "Monster Truck", 4, true);
        AutoMobile bus = new AutoMobile(16, "Ferrari", 4, false);
        AutoMobile car = new AutoMobile(17, "Chevi", 4, true);

        autoMobiles.add(motorCycle);
        autoMobiles.add(bus);
        autoMobiles.add(car);
        System.out.println("");

        ObjectsToFile managerObjectFile = new ObjectsToFile();

        managerObjectFile.writeObjectInFile("WriteObject", autoMobiles);
        autoMobiles2 = managerObjectFile.readObjectInFile("WriteObject", autoMobiles2);

        for (AutoMobile aux : autoMobiles2) {
            System.out.println(aux);
        }

    }
}
