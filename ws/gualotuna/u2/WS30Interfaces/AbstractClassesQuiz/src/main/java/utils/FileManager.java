/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public abstract class FileManager extends DataManager{
    String fileSystem;//1

    public FileManager(ArrayList<Table> tables, String database) {
        super(tables, database);//0.5
        this.fileSystem=fileSystem;
    }
    //0.5
    
    
    public abstract void openFile();   
   
    
    public abstract void closeFile();
    
    public abstract void addFile();
   
    
}
