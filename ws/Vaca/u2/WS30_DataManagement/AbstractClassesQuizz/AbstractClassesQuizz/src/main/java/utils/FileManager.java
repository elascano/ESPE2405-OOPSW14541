/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Luis Vaca, DCCO-ESPE
 */
public abstract class FileManager extends DataManager{ // 1.5

    protected String fileSystem; 

    public abstract void openFile();

    public abstract void closeFile();

    public abstract void add(String data);
    
    public FileManager(String fileSystem, String database) { // 0.5
        super(database);
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
