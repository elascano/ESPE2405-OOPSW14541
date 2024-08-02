/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

/**
 *
 * @author DELL
 */
public interface FileManager extends DataManager {
    public abstract void openFile(String fileName);
    public abstract void closeFile(String fileName);
}
