package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */

public class FileManager {
    
    public static void FileSave(Object object){
        try (BufferedWriter save = new BufferedWriter(new FileWriter("C:\\Users\\mateo\\Downloads\\ChickensData.txt",true))) {         
            System.out.println("\n--- Saved Data ---");
            System.out.println(object);
            save.write(object.toString());
            save.newLine();
            }  
            catch (IOException e) {
            }    
    }
    
    public static int FileReadLastId() {
        String lastLine = null;
        try (BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\mateo\\Downloads\\ChickensData.txt"))) {
            String line;
            while ((line = read.readLine()) != null) {
                lastLine = line;
            }
            if (lastLine != null) {
                String[] values = lastLine.split(",");
                try {
                    return Integer.parseInt(values[0]);
                } catch (NumberFormatException e) {
                    System.out.println("Error");
                    return 0;
                }
            }
        } catch (IOException e) {
        }
        return 0;
  
    }
}
