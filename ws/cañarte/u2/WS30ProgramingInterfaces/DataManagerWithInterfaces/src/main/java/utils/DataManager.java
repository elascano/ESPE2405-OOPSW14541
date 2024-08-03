/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public interface DataManager {
    String DATABASENAME= "oop";
    
    public abstract void create (String data, String collection);
    public abstract void update (String oldData,String newData, String collection);
    public abstract ArrayList<String> read  (String collection);
    public abstract void delete (String searchData, String collection);
}
