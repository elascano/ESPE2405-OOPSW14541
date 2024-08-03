/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public abstract class FileManager extends DataManager { //1 --> 2Total
    private String fileSystem;//0.5

    public FileManager(ArrayList table, String database) {
        super(table, database);
    }

    /**
     * @return the fileSystem
     */
    public String getFileSystem() {
        return fileSystem;
    }

    /**
     * @param fileSystem the fileSystem to set
     */
    public void setFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
    }
     public abstract void openFile();
    public abstract void closeFile();
    public abstract void add(String data);//0.5
}
