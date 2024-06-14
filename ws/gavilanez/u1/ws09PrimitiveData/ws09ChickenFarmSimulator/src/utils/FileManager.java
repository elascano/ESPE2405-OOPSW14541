/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.*;
/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class FileManager {
    public static void save(String data,String fileName, int type) {
        if(type == 1){//TXT
            fileName = fileName + ".txt";
        }
        if(type == 2){//CSV
            fileName = fileName + ".csv";
        }
        if(type == 3){//JSON
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
