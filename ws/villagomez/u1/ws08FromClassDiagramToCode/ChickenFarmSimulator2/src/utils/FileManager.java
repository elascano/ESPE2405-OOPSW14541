package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farmsilumator.model.Chicken;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class FileManager {

    public static void save(String data, String fileName, int type) {
        switch (type) {
            case 0 -> fileName = fileName + ".txt";
            case 1 -> fileName = fileName + ".csv";
            case 2 -> { 
                fileName = fileName + ".json";
                saveAsJson(data, fileName);
                return;
            }
            default -> {
                System.err.println("Unsupported file type");
                return;
            }
        }

        try (FileWriter fileWriter = new FileWriter(fileName, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
    
    private static void saveAsCsv(String data, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to the CSV file: " + e.getMessage());
        }
    }

    private static void saveAsJson(String data, String fileName) {
        // 'data' is a JSON string representing a Chicken object
        try (FileWriter fileWriter = new FileWriter(fileName, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to the JSON file: " + e.getMessage());
        }
    }

    public static void save(Chicken chicken, String fileName, int type) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String data;

        switch (type) {
            case 1 -> data = chicken.getId() + ","
                        + chicken.getName() + ","
                        + chicken.getColor() + ","
                        + chicken.isMolting() + ","
                        + chicken.getAge() + ","
                        + dateFormat.format(chicken.getBornOnDate());
            case 2 -> {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                data = gson.toJson(chicken);
            }
            default -> {
                System.err.println("Unsupported file type");
                return;
            }
        }

        save(data, fileName, type);
    }
}