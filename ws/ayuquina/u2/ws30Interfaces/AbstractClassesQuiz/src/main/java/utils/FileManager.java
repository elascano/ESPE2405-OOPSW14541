/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE tienes 2
 */
public abstract class FileManager extends DataManager{

    private String fileSystem;

    public FileManager(ArrayList<Table> tables, String dataBase, String fileSystem) {
        super(tables, dataBase);
        this.fileSystem = fileSystem;
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
    public abstract void addData(String data);
    
}
