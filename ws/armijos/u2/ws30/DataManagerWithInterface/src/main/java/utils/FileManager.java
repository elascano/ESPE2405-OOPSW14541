/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Enzo Armijos , Logic Legion DCCO-ESPE
 */
public abstract class FileManager implements DataManager {
    
public abstract void openFile(String FileName);
public abstract void closeFile(String FileName);
}
