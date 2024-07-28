/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public abstract class FileManager extends DataManager { //2 puntos
    private String fileSystem;
    
    public abstract void openFile();
    public abstract void closeFile();
    public abstract void add(String data);

    public FileManager(ArrayList<Table> tables, String dataBase,String fileSystem) {
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
    
}
