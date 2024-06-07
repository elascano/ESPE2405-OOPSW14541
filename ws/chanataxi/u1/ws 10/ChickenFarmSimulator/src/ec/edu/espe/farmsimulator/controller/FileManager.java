/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.view.ChickenView;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Marco Chanataxi, Dev Dynasty, DCCO-ESPE
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

    public void Save(String filename, List<Chicken> chickens) {
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

    public List<Chicken> readFromFile(String filename) {
        List<Chicken> chickens = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Assuming that the toString method of Chicken class is formatted properly
                String[] data = line.split(", ");
                // Parse each piece of data from the line and create a Chicken object
                int id = Integer.parseInt(data[0].split("=")[1]);
                String name = data[1].split("=")[1];
                String color = data[2].split("=")[1];
                boolean molting = Boolean.parseBoolean(data[4].split("=")[1]);
                Date bornOnDate = new Date(data[5].split("=")[1]);
                int age = Integer.parseInt(data[3].split("=")[1]);
                chickens.add(new Chicken(id, name, color, molting, bornOnDate, age));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chickens;
    }

    public List<Chicken> readFromJson(String filename) {
        List<Chicken> chickens = new ArrayList<>();
        Gson gson = new Gson();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            Type listType = new TypeToken<List<Chicken>>() {}.getType();
            chickens = gson.fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chickens;
    }

    public void updateChicken(int id, Chicken updatedChicken, List<Chicken> chickens) {
        for (int i = 0; i < chickens.size(); i++) {
            if (chickens.get(i).getId() == id) {
                chickens.set(i, updatedChicken);
                break;
            }
        }
    }

    public void deleteChicken(int id, List<Chicken> chickens) {
        chickens.removeIf(chicken -> chicken.getId() == id);
    }

    public Chicken findChicken(int id, List<Chicken> chickens) {
        for (Chicken chicken : chickens) {
            if (chicken.getId() == id) {
                return chicken;
            }
        }
        return null;
    }
}
