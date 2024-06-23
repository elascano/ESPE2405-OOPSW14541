/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import model.Chicken;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alexis Viteri DCO-ESPE
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

    public static String read(String fileName, int type) {
        List<String> hensRecord = new ArrayList<>();
        String chickenRecord = "", record = "";

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
                    record = chicken.toString(type);
                    hensRecord.add(record);
                }
            }
            chickenRecord = hensRecord.toString();
            return chickenRecord;

        } catch (IOException e) {
            System.err.println("Error at reading the file: " + e.getMessage());
        }
        return null;
    }

    public static void update(String records, int type) {
        Scanner scan = new Scanner(System.in);
        int idSearch, newId, newBornYear, newBornMonth, newBornDay, interator = 0;
        String newName, newColor, newBornDate, chickenRecord = "", fileName = "chickens.txt", recordNeded = "", hensRecord = "";
        boolean newMolting;
        
        System.out.println("Type the ID for the record you want to update: ");
        idSearch = scan.nextInt();

        recordNeded = find(idSearch, fileName);
        
        System.out.println(recordNeded + ", type again all the parameters to update the information");
        
        System.out.println("Enter the ID for the chicken:");
        newId = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the name of the chicken: ");
        newName = scan.nextLine();

        System.out.println("Enter the color of the chicken: ");
        newColor = scan.nextLine();

        System.out.println("The chicken is molting? (true or false): ");
        newMolting = scan.nextBoolean();

        LocalDate birthDate = DateValidator.getValidDate();
        newBornYear = birthDate.getYear();
        newBornMonth = birthDate.getMonthValue();
        newBornDay = birthDate.getDayOfMonth();
        newBornDate = newBornYear + "/" + newBornMonth + "/" + newBornDay;

        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);

        int year = period.getYears();
        int month = period.getMonths();
        int day = period.getDays();

        Chicken updatedChicken = new Chicken(newId, newColor, newName, newBornDate, newMolting, year, month, day);
        chickenRecord = updatedChicken.toString(type);

        try (BufferedReader bufferReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferReader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 8) {
                    int id = Integer.parseInt(parts[0]);
                    if (idSearch == id) {
                        if(interator == 0){
                            saveNewData(chickenRecord, "chickens", type);
                            interator++;
                        }else{
                            save(chickenRecord, "chickens", type);
                        }
                    } else {
                        String color = parts[1];
                        String name = parts[2];
                        String age = parts[3];
                        boolean molting = Boolean.parseBoolean(parts[4]);
                        int bornYear = Integer.parseInt(parts[5]);
                        int bornMonth = Integer.parseInt(parts[6]);
                        int bornDay = Integer.parseInt(parts[7]);
                        
                        Chicken chicken = new Chicken(id, color, name, age, molting, bornYear, bornMonth, bornDay);
                        hensRecord = chicken.toString(type);
                        
                        if(interator == 0){
                            saveNewData(hensRecord, "chickens", type);
                            interator++;
                        }else{
                            save(hensRecord, "chickens", type);
                        }
                        
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error at updating information to the file: " + e.getMessage());
        }
    }

    public static void delete(String records, int type) {
        Scanner scan = new Scanner(System.in);
        int idSearch, interator=0, option;
        String chickenRecord = "", record = "", fileName = "chickens.txt";
        
        System.out.println("Type the ID for the record you want to delete: ");
        idSearch = scan.nextInt();
        
        chickenRecord = find(idSearch, fileName);
        
        System.out.println("Are you sure you mant to delete the folowing data " + chickenRecord + "?\n(type yes or no)");
        option = DateValidator.getValidConfirmation();
        
        if(option == 1){
            try (BufferedReader bufferReader = new BufferedReader(new FileReader(fileName))) {
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
                            record = chicken.toString(type);
                            if(interator == 0){
                                saveNewData(record, "chickens", type);
                                interator++;
                            }else{
                                save(record, "chickens", type);
                            }
                        }
                    }
                }
            } catch (IOException e) {
                System.err.println("Error at deleting information of the file: " + e.getMessage());
            }
        }
    }

    public static String find(int idSearch, String records) {
        try (BufferedReader bufferReader = new BufferedReader(new FileReader(records))) {
            String line, henRecord;
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
                        
                        Chicken hen = new Chicken(id, color, name, age, molting, bornYear, bornMonth, bornDay);
                        henRecord = hen.toString();
                        return henRecord;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error at finding data of the file: " + e.getMessage());
        }
        return null;
    }
}
