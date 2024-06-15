package Utils;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class FileManager {

    private String fileName;
    private String fileType;

    public FileManager(String fileName, String fileType) {
        this.fileName = fileName;
        this.fileType = fileType;
    }

    public void create() {

        File fileCreator;

        try {

            fileCreator = new File(fileName + '.' + fileType);

            if (fileCreator.createNewFile()) {
                System.out.println("File created;");
            } else {
                System.out.println("Open file error");
            }

        } catch (IOException exception) {
            exception.printStackTrace(System.out);
        }

    }

    public void delete() {
        File fileEditor;
        fileEditor = new File(fileName + '.' + fileType);

        if (fileEditor.delete()) {
            System.out.println("File deleted;");
        } else {
            System.out.println("Delete file error");
        }

    }

    public void read() {
        FileReader reader;
        String content;

        try {
            reader = new FileReader(fileName + '.' + fileType);
            BufferedReader readerAux = new BufferedReader(reader);

            content = readerAux.readLine();
            
            while (content != null) {

                content = readerAux.readLine();
                
                System.out.println(content);
            }

        } catch (IOException exception) {
            exception.printStackTrace(System.out);
        }
    }

    public void save(String data) {

        try (FileWriter fileWriter = new FileWriter(fileName + "." + fileType, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write(data);
            bufferedWriter.newLine();

            System.out.println("Save file: " + fileName + "." + fileType);

        } catch (IOException exception) {

            System.err.println("Error writing to the file: " + exception.getMessage());

        }

    }

    public boolean find(String attributeBrowser, int index) {

        File fileFounder;

        fileFounder = new File(fileName + '.' + fileType);

        return fileFounder.exists();
    }
    

}
