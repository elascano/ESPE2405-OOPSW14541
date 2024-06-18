package UtilsPackage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class FileManager {
    public static void save(String data, String fileName, int type) {
        if (type == 0){
            fileName = fileName + ".txt";
         }
         if (type == 1){
            fileName = fileName + ".csv";
         }
          if (type == 2){
            fileName = fileName + ".json";
         }
          
    try (FileWriter fileWriter = new FileWriter(fileName, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
         bufferedWriter.write(data);
         bufferedWriter.newLine();
    }catch (IOException e){
         System.err.println("Error, writing to the file: " + e.getMessage());
    }
   
  }
    
    public static List<String> read(String fileName) throws IOException {
        List<String> fileLines = new ArrayList<>();
        try (FileReader reader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(reader)) {
              String line;
              while ((line = bufferedReader.readLine()) != null) {
                fileLines.add(line);
              }
            }
        
        return fileLines;
   
    }

    
    public static void delete (String fileName, int rowToDelete) throws IOException {

        String tempFileName = fileName + ".temp";

        List<String> fileLines = read(fileName);

        if (rowToDelete < 0 || rowToDelete >= fileLines.size()) {
        throw new IllegalArgumentException("Invalid row number: " + rowToDelete);
        } else {
            rowToDelete--; 
        }

        fileLines.remove(rowToDelete);

        try (FileWriter fileWriter = new FileWriter(tempFileName); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
          for (String line : fileLines) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
          }
        }

        new File(fileName).delete();

        new File(tempFileName).renameTo(new File(fileName));
    }

    
}
