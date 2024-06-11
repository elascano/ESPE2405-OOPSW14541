package utils;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author Carlos Pérez, TheJavaBandits, DCCO-ESPE
 */
public class FileManager {

    public static void save(String data, String fileName, int type) {

        if (type == 0) { //TXT
            fileName = fileName + ".txt";
        }
        if (type == 1) { //CSV
            fileName = fileName + ".csv";
        }
        if (type == 2) { //JSON
            fileName = fileName + ".json";
        }

        try (FileWriter fileWriter = new FileWriter(fileName, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write(data);
            bufferedWriter.newLine();

        } catch (IOException e) {
            System.err.println("Error pepito writing to the file: " + e.getMessage());
        }

    }
}
