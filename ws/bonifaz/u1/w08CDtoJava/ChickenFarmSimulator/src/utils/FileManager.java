package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class FileManager {

    public static void FileSave(String data, String fileName, int type) {

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

    public static int FileReadLastId(String fileName, int type) {
        String lastLine = "";
        String separator = "";
        if (type == 0) { //TXT
            fileName = fileName + ".txt";
            separator = ":";
        }
        if (type == 1) { //CSV
            fileName = fileName + ".csv";
            separator = ",";
        }
        if (type == 2) { //JSON
            fileName = fileName + ".json";
            separator = ",";
        }
        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = read.readLine()) != null) {
                lastLine = line;
            }
            if (lastLine != null) {
                String[] values = lastLine.split(separator);
                try {
                    if (type == 2) {
                        return Integer.parseInt(values[0].split(":")[1]);
                    } else {
                        return Integer.parseInt(values[0]);
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error read last data");
                    return 0;
                }
            }
        } catch (IOException e) {
        }
        return 0;

    }
}
