/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS,DCCO-ESPE
 */

public class FileManager {

    public static void save(Chicken data, int type, String fileName) {
        switch (type) {
            case 0: // TXT
                fileName = fileName + ".txt";
                break;
            case 1: // CSV
                fileName = fileName + ".csv";
                break;
            case 2: // JSON
                fileName = fileName + ".json";
                saveAsJson(data, fileName);
                return;
            default:
                System.err.println("Unsupported file type");
                return;
        }

        try (FileWriter fileWriter = new FileWriter(fileName, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(data.toString()); // Convert data to string before writing
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    private static void saveAsJson(Chicken data, String fileName) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(data);

        try (FileWriter fileWriter = new FileWriter(fileName, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(json);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to the JSON file: " + e.getMessage());
        }
    }
}




