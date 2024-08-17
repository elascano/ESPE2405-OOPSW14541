/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

/**
 *
 * @author Jenniffer Marquez, Javasquad, DCCO-ESPE
 */
public interface FileManager extends DataManager{
    public abstract void openFile(String filename);
    public abstract void closeFile (String filename);
    
}
