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
    public static void saveChickenToFile(Chicken chicken) {
        Filemaneger.save(chicken);
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        String formattedDate = dateFormat.format(chicken.getBornOnDate());
        String filename = "chicken_" + chicken.getId() + "_" + formattedDate + ".txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.print(chicken);
            /*writer.print("Name: " + chicken.getName());
            writer.print("Color: " + chicken.getColor());
            writer.print("Age: " + chicken.getAge());
            writer.print("Is molting: " + chicken.isMolting());
            writer.print("Born on date: " + formattedDate);*/
        } catch (IOException e) {
            System.out.println("Error: Unable to save chicken information to file: " + e.getMessage());
            // Aquí puedes agregar un código adicional para manejar la excepción según los requisitos de tu aplicación.
        }
    }
}