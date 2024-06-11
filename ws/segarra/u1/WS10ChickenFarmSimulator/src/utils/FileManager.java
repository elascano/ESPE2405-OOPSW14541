/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import ec.edu.espe.chickenfarmsimulator.model.Chicken;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class FileManager {

    public static void saveNewData(String data, String fileName, int type) {
        if (type == 0) { //TXT
            fileName = fileName + ".txt";
        }
        if (type == 1) { //CSV
            fileName = fileName + ".csv";
        }
        if (type == 2) { //JSON
            fileName = fileName + ".json";
        }

        try (FileWriter fileWriter = new FileWriter(fileName, false); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write(data);
            bufferedWriter.newLine();

        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

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
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    public static String read(String fileName) {
        List<Chicken> hensRecord = new ArrayList<>();
        String chickenRecord = "";

        try (BufferedReader bufferReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferReader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 8) {
                    int id = Integer.parseInt(parts[0]);
                    String color = parts[1];
                    String name = parts[2];
                    String age = parts[3];
                    boolean molting = Boolean.parseBoolean(parts[4]);
                    int bornYear = Integer.parseInt(parts[5]);
                    int bornMonth = Integer.parseInt(parts[6]);
                    int bornDay = Integer.parseInt(parts[7]);

                    Chicken chicken = new Chicken(id, color, name, age, molting, bornYear, bornMonth, bornDay);
                    hensRecord.add(chicken);
                }
                chickenRecord = hensRecord.toString();
            }
            return chickenRecord;

        } catch (IOException e) {
            System.err.println("Error at reading the file: " + e.getMessage());
        }
        return null;
    }

    public static void update(String records, int type) {
        Scanner scan = new Scanner(System.in);
        int idSearch;
        String chickenRecord = "";
        Chicken recordNeded;

        System.out.println("Type the ID for the record you want to update: ");
        idSearch = scan.nextInt();

        recordNeded = find(idSearch, records);

        List<Chicken> hensRecord = new ArrayList<>();

        try (BufferedReader bufferReader = new BufferedReader(new FileReader(records))) {
            String line;
            while ((line = bufferReader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 8) {
                    int id = Integer.parseInt(parts[0]);
                    if (idSearch == id) {
                        hensRecord.add(recordNeded);
                    } else {
                        String color = parts[1];
                        String name = parts[2];
                        String age = parts[3];
                        boolean molting = Boolean.parseBoolean(parts[4]);
                        int bornYear = Integer.parseInt(parts[5]);
                        int bornMonth = Integer.parseInt(parts[6]);
                        int bornDay = Integer.parseInt(parts[7]);

                        Chicken chicken = new Chicken(id, color, name, age, molting, bornYear, bornMonth, bornDay);
                        hensRecord.add(chicken);
                    }
                    chickenRecord = hensRecord.toString();
                }
            }
        } catch (IOException e) {
            System.err.println("Error at reading the file: " + e.getMessage());
        }

        saveNewData(records, "chickens.txt", type);
    }

    public static void delete(String records, int type) {
        Scanner scan = new Scanner(System.in);
        int idSearch;
        String chickenRecord = "";

        System.out.println("Type the ID for the record you want to delete: ");
        idSearch = scan.nextInt();

        List<Chicken> hensRecord = new ArrayList<>();

        try (BufferedReader bufferReader = new BufferedReader(new FileReader(records))) {
            String line;
            while ((line = bufferReader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 8) {
                    int id = Integer.parseInt(parts[0]);
                    if (id != idSearch) {
                        String color = parts[1];
                        String name = parts[2];
                        String age = parts[3];
                        boolean molting = Boolean.parseBoolean(parts[4]);
                        int bornYear = Integer.parseInt(parts[5]);
                        int bornMonth = Integer.parseInt(parts[6]);
                        int bornDay = Integer.parseInt(parts[7]);

                        Chicken chicken = new Chicken(id, color, name, age, molting, bornYear, bornMonth, bornDay);
                        hensRecord.add(chicken);
                    }
                    chickenRecord = hensRecord.toString();
                }
            }
        } catch (IOException e) {
            System.err.println("Error at reading the file: " + e.getMessage());
        }

        saveNewData(records, "chickens.txt", type);
    }

    public static Chicken find(int idSearch, String records) {
        try (BufferedReader bufferReader = new BufferedReader(new FileReader(records))) {
            String line;
            while ((line = bufferReader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 8) {
                    int id = Integer.parseInt(parts[0]);
                    if (id == idSearch) {
                        String color = parts[1];
                        String name = parts[2];
                        String age = parts[3];
                        boolean molting = Boolean.parseBoolean(parts[4]);
                        int bornYear = Integer.parseInt(parts[5]);
                        int bornMonth = Integer.parseInt(parts[6]);
                        int bornDay = Integer.parseInt(parts[7]);

                        return new Chicken(id, color, name, age, molting, bornYear, bornMonth, bornDay);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error at reading the file: " + e.getMessage());
        }
        return null;
    }
}