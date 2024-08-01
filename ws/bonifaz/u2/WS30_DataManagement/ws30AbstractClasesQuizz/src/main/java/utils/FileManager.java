/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public abstract class FileManager extends DataManager { // 1 abstract+extends --->TOTAL: 1
    private String fileSystem;//0.5

    
    
    public FileManager(String fileSystem, String dataBase) {//-0.25 wrong constructor
        super(dataBase);
        this.fileSystem = fileSystem;
    }
    //0 prototype

    // +0.5 setters and getters
    public FileManager(String dataBase) {
        super(dataBase);
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
