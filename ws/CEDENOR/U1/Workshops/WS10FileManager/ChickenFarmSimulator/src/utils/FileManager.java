package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
* @author Nahomi Cedeño, CODE CREATORS, DCCO-ESPE
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
            System.err.println("Error writing to the file: " + e.getMessage());
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

    public static List<String> readFile(String fileName, int type) {
        List<String> lines = new ArrayList<>();
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
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return lines;
    }

    public static String searchInFile(String fileName, int type, String searchTerm) {
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
                if (line.contains(searchTerm)) {
                    return line;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return null;
    }

    public static void deleteFromFile(String fileName, int type, String searchTerm) {
        if (type == 0) {
            fileName = fileName + ".txt";
        }
        if (type == 1) {
            fileName = fileName + ".csv";
        }
        if (type == 2) {
            fileName = fileName + ".json";
        }

        File inputFile = new File(fileName);
        File tempFile = new File("tempfile.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile)); BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(searchTerm)) {
                    line = line.replace(searchTerm, ""); // Replace the search term with an empty string
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error processing the file: " + e.getMessage());
        }

        if (!inputFile.delete()) {
            System.err.println("Could not delete the original file");
            return;
        }
        if (!tempFile.renameTo(inputFile)) {
            System.err.println("Could not rename the temp file");
        }
    }

    public static void editInFile(String fileName, int type, String searchTerm, String newData) {
        if (type == 0) {
            fileName = fileName + ".txt";
        }
        if (type == 1) {
            fileName = fileName + ".csv";
        }
        if (type == 2) {
            fileName = fileName + ".json";
        }

        File inputFile = new File(fileName);
        File tempFile = new File("tempfile.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile)); BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(searchTerm)) {
                    line = line.replace(searchTerm, newData);
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error processing the file: " + e.getMessage());
        }

        if (!inputFile.delete()) {
            System.err.println("Could not delete the original file");
            return;
        }
        if (!tempFile.renameTo(inputFile)) {
            System.err.println("Could not rename the temp file");
        }
    }

}
