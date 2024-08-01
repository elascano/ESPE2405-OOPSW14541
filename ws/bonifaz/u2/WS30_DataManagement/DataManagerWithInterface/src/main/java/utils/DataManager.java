/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public interface DataManager {
    String DATABASENAME="opp";
    
    public abstract void create(String data, String collection);
    public abstract void delete(String collection, String sarchData);
    public abstract void update(String collection, String oldData, String newData);
    public abstract ArrayList<String> read(String collection);
}
