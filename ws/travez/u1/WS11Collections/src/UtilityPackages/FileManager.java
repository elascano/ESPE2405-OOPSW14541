package UtilityPackages;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class FileManager {

    public static void save(String data, String fileName, String fileType) {
        try (FileWriter fileWriter = new FileWriter(fileName + "." + fileType, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write(data);
            bufferedWriter.newLine();

            System.out.println("Save file: " + fileName + "." + fileType);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
    
    public static Collection load(){
        Collection dataLoaded;
        dataLoaded = new ArrayList();
        
        ObjectMapper objectMapper = new ObjectMapper();
        
        
        return null;
        
    }
    
    
    
}
