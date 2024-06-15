/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class managment {
    public static void save(Object information, String fileName) {
        fileName = fileName + ".json";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Object> data = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            Type listType = new TypeToken<ArrayList<Object>>() {
            }.getType();
            data = gson.fromJson(bufferedReader, listType);
        } catch (FileNotFoundException e) {
            System.out.println("File not found, creating a new one.");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        data.add(information);

        try (FileWriter fileWriter = new FileWriter(fileName); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            gson.toJson(data, bufferedWriter);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
    
    public static String load(String fileName){
        fileName = fileName + ".json";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Object> data = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            Type listType = new TypeToken<ArrayList<Object>>() {
            }.getType();
            data = gson.fromJson(bufferedReader, listType);
        }catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        
        return data.toString();
    }
}
