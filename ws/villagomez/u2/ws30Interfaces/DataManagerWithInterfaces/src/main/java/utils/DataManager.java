/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public interface DataManager {
    String DATABASENAME = "oop";
    
    public abstract void create ( String data, String collection);
    public abstract void update (String collection, String newData, String oldData);
    public abstract ArrayList<String> read (String collection);
    public abstract void delete (String collection, String searchData);
    
}
