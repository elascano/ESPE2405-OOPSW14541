package utils;

import java.util.ArrayList;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public interface DataManager {
    String DATABASENAME = "oop";
    
    public abstract void create(String data, String collection);
    public abstract void update(String data, String collection, String newData);
    public abstract ArrayList<String> read(String collection);
    public abstract void delete(String collection, String searchData);
}
