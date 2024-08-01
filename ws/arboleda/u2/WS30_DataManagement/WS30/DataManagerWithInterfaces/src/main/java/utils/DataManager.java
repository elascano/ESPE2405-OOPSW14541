package utils;

import java.util.ArrayList;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public interface DataManager {
    String DATABASENAME="oop";
    
    public abstract void create(String data, String colletion);
    public abstract void create(String collection, String oldData, String newData);
    public abstract ArrayList<String> read(String collection);
    public abstract void read(String collection,String searchData);
    
}
