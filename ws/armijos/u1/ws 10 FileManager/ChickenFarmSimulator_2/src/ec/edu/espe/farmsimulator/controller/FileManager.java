/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.controller;

import ec.edu.espe.farmsimulator.model.Chicken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Enzo Armijos , Logic Legion DCCO-ESPE
 */
public class FileManager {

    private final String filePath;

    public FileManager(String filePath) {
        this.filePath = filePath;
    }

    public void saveChickenToFile(Chicken chicken, String fileName) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(filePath + "\\" + fileName, true)) {
            String json = gson.toJson(chicken);
            writer.write(json + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveChickenToJSONFile(Chicken chicken, String fileName) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(filePath + "\\" + fileName, true)) {
            String json = gson.toJson(chicken);
            writer.write(json + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
