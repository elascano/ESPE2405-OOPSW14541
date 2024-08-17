package utils;

import java.util.ArrayList;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public interface DataManager {
    String DATABASENAME = "oop";
    
    public  void create(String data, String collection);
    public  void update(String data, String collection, String newData);
    public  ArrayList<String> read(String collection);
    public  void delete(String collection, String searchData);
}
