package ec.edu.espe.objecttofile.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE 
 *
 */

public class DeserializeDog {
    public static List<Dog> deserializeDogs() {
        List<Dog> dogs = null;

        try (FileInputStream fileIn = new FileInputStream("dogs.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            
            dogs = (List<Dog>) in.readObject();  
            
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Clase Dog no encontrada");
            c.printStackTrace();
        }

        return dogs;
    }

    public static void main(String[] args) {
        List<Dog> dogs = deserializeDogs();

        System.out.println("Lista de Perros:");
        if (dogs != null) {
            for (Dog dog : dogs) {
                System.out.println(dog);
            }
        } else {
            System.out.println("No se encontraron perros.");
        }
    }
}
