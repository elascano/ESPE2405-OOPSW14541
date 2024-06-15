
package utils;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author David Pantoja, Java Squad, DCCO-ESPE
 */
public class FileManager {

    // Método para guardar datos en un archivo
    public static void save(String data, String fileName, String type) {
        try (FileWriter fileWriter = new FileWriter(fileName + "." + type, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    // Método para leer datos de un archivo
    public static List<String> read(String fileName, String type) {
        List<String> data = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName + "." + type))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return data;
    }

    // Método para actualizar datos en un archivo
    public static void update(String fileName, String type, String oldData, String newData) {
        List<String> data = read(fileName, type);
        try (FileWriter fileWriter = new FileWriter(fileName + "." + type, false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String line : data) {
                if (line.equals(oldData)) {
                    bufferedWriter.write(newData);
                } else {
                    bufferedWriter.write(line);
                }
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al actualizar el archivo: " + e.getMessage());
        }
    }

    // Método para eliminar datos de un archivo
    public static void delete(String fileName, String type, String dataToDelete) {
        List<String> data = read(fileName, type);
        try (FileWriter fileWriter = new FileWriter(fileName + "." + type, false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String line : data) {
                if (!line.equals(dataToDelete)) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            System.err.println("Error al eliminar del archivo: " + e.getMessage());
        }
    }

    // Método para encontrar datos en un archivo
    public static boolean find(String fileName, String type, String dataToFind) {
        List<String> data = read(fileName, type);
        for (String line : data) {
            if (line.equals(dataToFind)) {
                return true;
            }
        }
        return false;
    }

    // Método para crear un nuevo archivo
    public static void create(String fileName, String type) {
        try (FileWriter fileWriter = new FileWriter(fileName + "." + type, false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            
            // Creando un nuevo archivo escribiendo una cadena vacía
            bufferedWriter.write("");
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}

