package ec.edu.espe.objecttofile.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE 
 *
 */

public class SerializeDog {
    public static void serializeDogs(List<Dog> dogs) {
        try (FileOutputStream fileOut = new FileOutputStream("dogs.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            
            out.writeObject(dogs); 
            
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Dog newDog = new Dog("Jacob", 2, "Cafe", "Pequines");

        
        List<Dog> dogs = DeserializeDog.deserializeDogs();
        if (dogs == null) {
            dogs = new ArrayList<>();
        }

        
        dogs.add(newDog);

        
        serializeDogs(dogs);

        
        }
    }

