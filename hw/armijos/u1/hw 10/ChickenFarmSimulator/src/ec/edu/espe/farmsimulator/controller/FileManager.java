/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.view.ChickenView;
import java.io.BufferedWriter;
import java.io.FileWriter;
        import java.io.IOException;
import java.util.List;

/**
 *
 * @authorEnzo Armijos,Logic Legion, DCCO-ESPE
 */
public class FileManager {
    
    private Chicken model;
    private ChickenView view;

    public FileManager(Chicken model, ChickenView view) {
        this.model = model;
        this.view = view;
    }

    public FileManager() {
    }         

    public void setChickenDetailsFromUser() {
        this.model = view.getChickenDetailsFromUser();
    }

    public Chicken getChickenDetails() {
        return model;
    }

    public void updateView() {
        view.displayChickenDetails(model);
    }
    
    public void Save (String filename, List<Chicken> chickens) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Chicken chicken : chickens) {
                writer.write(chicken.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public void saveToJson(String filename, List<Chicken> chickens) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            gson.toJson(chickens, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
