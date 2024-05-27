package ec.edu.espe.farmsimulator.controller;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
 */
public class FileManager {

    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter("C:\\prueba\\ChickenClass.txt"))) {
            Chicken[] chickens = {
                new Chicken(1, "Alejo", "purple", 7, true, new Date()),
                new Chicken(2, "John", "doe", 1, false, new Date()),
                new Chicken(3, "Alice", "black", 0, true, new Date()),
                new Chicken(4, "Bob", "smith", 1, false, new Date()),
                new Chicken(5, "Eve", "white", 0, true, new Date()),
                new Chicken(6, "Charlie", "jones", 1, false, new Date()),
                new Chicken(7, "Grace", "green", 0, true, new Date()),
                new Chicken(8, "David", "brown", 1, false, new Date()),
                new Chicken(9, "Hannah", "black", 0, true, new Date()),
                new Chicken(10, "Ivy", "white", 1, false, new Date())
            };

            for (Chicken chicken : chickens) {
                writer.write(chicken.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
}
    }
}
