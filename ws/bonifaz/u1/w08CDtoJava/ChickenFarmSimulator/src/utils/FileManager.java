package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    public static void FileRead(String fileName, int type) {
        if (type == 0) { //TXT
            fileName = fileName + ".txt";
        }
        if (type == 1) { //CSV
            fileName = fileName + ".csv";
        }
        if (type == 2) { //JSON
            fileName = fileName + ".json";
        }
        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = read.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
        }
    }

    public static String FindData(String fileName, int type, String wordSearch) {
        if (type == 0) {
            fileName = fileName + ".txt";
        }
        if (type == 1) {
            fileName = fileName + ".csv";
        }
        if (type == 2) {
            fileName = fileName + ".json";
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(wordSearch)) {
                    return line;
                }
            }
        } catch (IOException e) {
        }
        return "";
    }

    public static void UpdateData(String fileName, int type, String wordSearch, String newData) {
        
        if (type == 0) {
            fileName = fileName + ".txt";
        }
        if (type == 1) {
            fileName = fileName + ".csv";
        }
        if (type == 2) {
            fileName = fileName + ".json";
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(wordSearch)) {
                    line = line.replace(wordSearch, newData);
                }
                FileSave(line, fileName, type);
            }
        } catch (IOException e) {
        }
    }



public static void DeleteData(String fileName, int type, int idEdit) {
        String separator = "";
        int numero;
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
        List<String> lineas = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] values = linea.split(separator);
                if (type == 2) {
                    numero = Integer.parseInt(values[0].split(":")[1]);
                } else {
                    numero = Integer.parseInt(values[0]);
                }
                if (numero == idEdit) {
                    continue;
                }
                lineas.add(linea);
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String l : lineas) {
                writer.write(l);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {

        }
    }
}
