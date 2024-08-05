/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Enzo Armijos , Logic Legion DCCO-ESPE
 */
public interface DataManager {
    
    String DATABASENAME = "oop";
    
    public abstract void create(String data , String collection);
    public abstract void update(String collection,String oldDate,String newDate);
    public abstract ArrayList<String>read(String collection);
    public abstract void delete(String collection , String searchData);
}
