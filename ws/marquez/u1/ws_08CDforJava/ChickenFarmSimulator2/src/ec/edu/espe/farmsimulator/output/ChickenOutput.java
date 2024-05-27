/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.output;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
/**
 *
 * @author Jenniffer Marquez, Javasquad, DCCO-ESPE
 */
public class ChickenOutput {
    public static void saveChickenToFile(Chicken chicken, String filename) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(chicken.getBornOnDate());
        
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("ID: " + chicken.getId());
            writer.println("Name: " + chicken.getName());
            writer.println("Color: " + chicken.getColor());
            writer.println("Age: " + chicken.getAge());
            writer.println("Is molting: " + chicken.isMolting());
            writer.println("Born on date: " + formattedDate);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
