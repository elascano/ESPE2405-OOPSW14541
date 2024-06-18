/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jenniffer Marquez, Javasquad, DCCO-ESPE
 */
public class Filemaneger {
    public static <T> void save(T object) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        String formattedDate = dateFormat.format(new Date()); // Use current date for file name if no date available

        String filename = "object_" + formattedDate + ".txt";
        if (object instanceof DateFormatted) {
            DateFormatted dateFormattedObject = (DateFormatted) object;
            filename = "object_" + dateFormat.format(dateFormattedObject.getDateForFilename()) + ".txt";
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.print(object.toString());
        } catch (IOException e) {
            System.out.println("Error: Unable to save object information to file: " + e.getMessage());
            // Aquí puedes agregar un código adicional para manejar la excepción según los requisitos de tu aplicación.
        }
    }

    public interface DateFormatted {
        Date getDateForFilename();
    }
}
