
package espe.edu.ec.farmsimulator.controller;
import espe.edu.ec.farmsimulator.model.Chicken;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public class SaveToFile {
    public static void saveChickenToFile(Chicken chicken, String filename) throws IOException {
    try (FileWriter writer = new FileWriter(filename)) {
      writer.write("ID: " + chicken.getId() + "\n");
      writer.write("Name: " + chicken.getName() + "\n");
      writer.write("Color: " + chicken.getColor() + "\n");
      writer.write("Age: " + chicken.getAge() + "\n");
      writer.write("Molting: " + chicken.isMolting() + "\n");
      writer.write("Born on Date: " + chicken.getBornOnDate() + "\n");
    }
  }
}
