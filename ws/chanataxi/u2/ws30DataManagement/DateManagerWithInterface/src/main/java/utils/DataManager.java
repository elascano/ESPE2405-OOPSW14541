/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

/**
 *
 * @author Marco Chanataxi, Dev Dynasty, DCCO-ESPE
 */
public interface DataManager {
    String DATABASENAME="opp";
    
    public abstract void create(String data, String collection);
    public abstract void update(String collections, String onlData, String newData);
    public abstract void delete (String collections, String searchData);
    
}
